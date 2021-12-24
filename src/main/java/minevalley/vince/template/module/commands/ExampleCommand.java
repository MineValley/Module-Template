package minevalley.vince.template.module.commands;

import minevalley.core.api.User;
import minevalley.core.api.enums.FractionService;
import minevalley.core.api.enums.TeamRank;
import minevalley.core.api.utils.command.Command;
import minevalley.core.api.utils.command.CommandOptions;
import minevalley.core.api.utils.command.PlayerCommand;

import java.util.List;

@CommandOptions(
        commands = {"example", "ex"}, // command-spelling and aliases (Always have to be written in lower case!)
        successMessage = "", // message to print, if onCommand() returns SUCCESS
        playerRank = {}, // this can be omitted (default value is {})
        fractions = {FractionService.POLICE},
        teamRanks = {TeamRank.DEVELOPMENT, TeamRank.ADMINISTRATION, TeamRank.SERVER_LEAD},
        requireSupportService = false, // user has to be in support service (if false, option can be omitted)
        syntax = "example <necessary argument> [<unnecessary argument>]", //correct syntax
        correctSyntaxLength = 0, // correct number of arguments
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