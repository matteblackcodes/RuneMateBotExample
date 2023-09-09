package com.botexample.bots.examplebot;

import com.runemate.game.api.script.framework.LoopingBot;

class ExampleBot extends LoopingBot {

    @Override
    public void onStart(String... arguments) {
        setLoopDelay(200);
    }

    @Override
    public void onLoop() {
        System.out.println("Bot loop!");
    }
}