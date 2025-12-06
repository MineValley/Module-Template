package minevalley.vince.template.module.commands;

import com.mojang.brigadier.arguments.StringArgumentType;
import minevalley.core.api.commands.Commands;
import minevalley.core.api.users.OnlineUser;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public final class ExampleCommand {

    public static void initCommand() {
        Commands.literal("example")
                .requires(user -> user.isTeamler() && user.team().isOperator())
                .executes(context -> {
                    // Command logic
                    final OnlineUser sender = context.getSender();
                    // ...
                })
                .then(Commands.literal("optional-argument")
                        .then(Commands.argument("necessary-argument", StringArgumentType.string())
                                .requires(user -> user.isTeamler() && user.team().isOperator())
                                .executes(context -> {
                                    // Command logic
                                    final OnlineUser sender = context.getSender();
                                    final String necessaryArgument = context.getArgument("necessary-argument", String.class);
                                    sender.sendMessage(
                                            Component.text("Necessary Argument: ", NamedTextColor.AQUA)
                                                    .append(Component.text(necessaryArgument, NamedTextColor.YELLOW))
                                    );
                                    // ...
                                })
                        ));
    }
}