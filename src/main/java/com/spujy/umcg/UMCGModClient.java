package com.spujy.umcg;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class UMCGModClient implements ClientModInitializer {

    private static KeyBinding openMenuKey;

    @Override
    public void onInitializeClient() {
        openMenuKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                "key.umcg.open_menu", // Translation key
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_G,      // The default key code
                "category.umcg.keys"  // Category in controls menu
        ));

        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (openMenuKey.wasPressed()) {
                // Open the screen if the player isn't already in another menu
                if (client.currentScreen == null) {
                    client.setScreen(new UMCGScreen());
                }
            }
        });
    }
}
