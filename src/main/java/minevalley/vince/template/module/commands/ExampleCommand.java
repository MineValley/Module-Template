package minevalley.vince.template.module.commands;

import eu.minevalley.core.api.User;
import eu.minevalley.core.api.enums.Fraction;
import eu.minevalley.core.api.enums.TeamRank;
import eu.minevalley.core.api.utils.command.CommandOptions;
import eu.minevalley.core.api.utils.command.PlayerCommand;

import java.util.List;

@CommandOptions(
        commands = {"example", "ex"}, // command-spelling and aliases
        successMessage = "", // message to print, if onCommand() returns SUCCESS
        playerRank = {}, // this can be omitted (default value is {})
        fractions = {Fraction.POLICE},
        teamRanks = {TeamRank.ENTWICKLUNG, TeamRank.ADMINISTRATION, TeamRank.SERVERLEITUNG},
        syntax = "example <necessary argument> [<unnecessary argument>]",
        abuseWarning = true // warning is sent into team-chat if user tries to perform this command without permission
)
public class ExampleCommand extends PlayerCommand {

    @Override
    public CommandResponse onCommand(User user, String[] strings) {
        // Command logic
        return CommandResponse.SUCCESS;
    }

    @Override
    public List<String> onTabComplete(User user, String[] strings) {
        // Define tab-completions
        return null;
    }
}