package minevalley.vince.template.module.command;

import com.mojang.brigadier.arguments.StringArgumentType;
import eu.minevalley.proxima.api.command.Commands;
import eu.minevalley.proxima.api.user.ProxyUser;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;

public final class ExampleCommand {

    public static void initCommand() {
        Commands.literal("example")
                .requires(user -> user.isTeamler() && user.team().isOperator())
                .executes(context -> {
                    // Command logic
                    final ProxyUser sender = context.getSender();
                    // ...
                })
                .then(Commands.literal("optional-argument")
                        .then(Commands.argument("necessary-argument", StringArgumentType.string())
                                .requires(user -> user.isTeamler() && user.team().isOperator())
                                .executes(context -> {
                                    // Command logic
                                    final ProxyUser sender = context.getSender();
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