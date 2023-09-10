# RuneMate Example Bot
A RuneMate example bot to get you started developing RuneMate bots!
This project and guide have only been tested on Windows, but the guide should work for MacOS as well.

This guide isn't meant to teach you how to make a bot, just how to set up your IDE for bot development.


## Getting started

### Set up the JDK

RuneMate is bundled with a JDK, so we can just point to that!

- Navigate to `File -> Project Structure...`.
- On the left side of the Project Structure window, select `Project`.
- Click the SDK select dropdown and go down to `+ Add SDK`.
- Select `JDK...`. 
- Navigate to your RuneMate install, usually `C:\Program Files\RuneMate` and select the `jre` Folder.

Now your JDK should be correctly set to temurin-17 

### Install Module Dependencies

You will need to add `RuneMate.jar`, `lombok.jar` and `runemate-game-api.jar` to your project as module dependencies.


- Click on File from the toolbar.
- Select Project Structure option (`CTRL + SHIFT + ALT + S` on Windows/Linux, `⌘ + ;` on Mac OS X).
- Select Modules at the left panel.
- Select Dependencies tab.
- Click on the `+` icon.
- Select the `JARs or directories` option.
- Navigate to the location of your `RuneMate.jar`, typically located at `C:\Program Files\RuneMate\RuneMate.jar` for Windows users.

You will need to repeat the above steps to add `runemate-game-api.jar` which is typically located at `C:\Users\<YourUser>\RuneMate\resources`, for Windows users.

Your module dependencies should look something like this.
![module dependencies](tutorial-assets/module-dependencies.png)


### Set up the Run Configuration

Now that we have all of our dependencies taken care of, we'll want to be able to test that our bot is working and our project is set up correctly. We can do this by setting up a Run Configuration.

Step 1: Open Run/Debug Configurations

In IntelliJ, navigate to `Run -> Edit Configurations`. This will open the Run/Debug Configurations dialog.

Step 2: Add a new JAR Application configuration

Click on the `+` button on the top left of the dialog and select `JAR Application`. This will create a new `JAR Application` configuration. From here, you can specify a name for the configuration! I recommend something like `"LAUNCH"`

Step 3: Specify the JAR file

In the configuration settings, click on the ... button next to the Path to JAR field. Locate and select the RuneMate.jar file, typically located at `C:\Program Files\RuneMate\RuneMate.jar`.

Step 4: Provide program arguments

In the `Program arguments` field you will need to specify the `--dev` flag.

Step 5: VM options

You may need to allocate more memory to RuneMate and your bot, to do this you can specify `-Xmx4G` in VM Options to allocate 4 GB of memory to RuneMate and your bot.

Your Run Configuration should look something like this.

![Launch Config!](tutorial-assets/launch-config.png)

Click Apply to save your configuration, then OK to close the dialog.

### Automatically build project before launch

That's pretty much it but there is one last optional step. If you run the launch configuration that we created previously, it will launc RuneMate.jar but it won't build your project. You can build your project manually by navigating to `Build -> Build Project`
If you want your project to build automatically then read on!

The keen-eyed among you will probably notice that there is already a Run Configuration called "BUILD" configured in the project. In order to utilise this Run Configuration, we can open our LAUNCH configuration that we configured previously. At the bottom of the LAUNCH run configuration's window you will see a section titled "Before Launch"
Go ahead and hit the `+` Icon here and select `Run Another Configuration` and select `BUILD`

Now when you run the `LAUNCH` run configuration, your project will build automatically!

### Get RuneMate to recognize the ExampleBot

By default, when you launch, the examplebot isn't going to show up in RuneMate. That's because we need to tell RuneMate to look inside your project's build directory for your bots.

To do this, run the `LAUNCH` run configuration and 

## What next?

Congratulations, Your IDE has been set up successfully! But you might be asking yourself "What now?"

Now that your environment is set up, you can start developing your bot. RuneMate has various tutorials available to help you get started with writing bots for RuneMate. You can also check out other bot examples and resources in the [RuneMate community](https://www.runemate.com/community/#developer.161).

The best way to stay up to date with how to make bots and the newest trends in bot development is to join the [RuneMate Discord](https://discord.gg/zKEJgmQv)!

