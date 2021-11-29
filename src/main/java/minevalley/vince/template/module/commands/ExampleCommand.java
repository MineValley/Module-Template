package minevalley.vince.template.module.commands;

import minevalley.core.api.User;
import minevalley.core.api.enums.Fraction;
import minevalley.core.api.enums.TeamRank;
import minevalley.core.api.utils.command.PlayerCommand;
import minevalley.core.api.utils.command.Command;
import minevalley.core.api.utils.command.CommandOptions;

import java.util.List;

@CommandOptions(
        commands = {"example", "ex"}, // command-spelling and aliases
        successMessage = "", // message to print, if onCommand() returns SUCCESS
        playerRank = {}, // this can be omitted (default value is {})
        fractions = {Fraction.POLICE},
        teamRanks = {TeamRank.DEVELOPMENT, TeamRank.ADMINISTRATION, TeamRank.SERVER_LEAD},
        syntax = "example <necessary argument> [<unnecessary argument>]",
        abuseWarning = true // warning is sent into team-chat if user tries to perform this command without permission
)
public class ExampleCommand extends PlayerCommand {

    @Override
    public Command.CommandResponse onCommand(User user, String[] args) {
        // Command logic
        return Command.CommandResponse.SUCCESS;
    }

    @Override
    public List<String> onTabComplete(User user, String[] args) {
        // Define tab-completions
        return null;
    }
}