package com.spujy.umcg;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.component.Component;
import net.minecraft.text.Text;

import java.awt.*;

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
}
