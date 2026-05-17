package com.spujy.umcg;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.component.Component;
import net.minecraft.text.Text;


public class UMCGScreen extends Screen {

    private int selectedChapter = 1;
    private final int menuWidth = 260;
    private final int menuHeight = 180;

    public UMCGScreen() {
        super(Text.literal("Minecraft Guide"));
    }

    @Override
    protected void init(){
        int startX = (this.width - menuWidth) / 2;
        int startY = (this.height - menuHeight) / 2;
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        int startX = (this.width - menuWidth) / 2;
        int startY = (this.height - menuHeight) /2;

        context.fill(startX, startY, startX + menuWidth, startY + menuHeight, 0xD0000000);
        context.drawText(this.textRenderer, "UMCG Menu", startX + 10, startY + 10, 0xFFFFFF, false);
        super.render(context, mouseX, mouseY, delta);
    }

    @Override
    public boolean shouldPause() {
        return true;
    }
}
