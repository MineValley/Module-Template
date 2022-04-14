package minevalley.vince.template.module.commands;

import minevalley.core.api.User;
import minevalley.core.api.enums.FractionService;
import minevalley.core.api.enums.TeamRank;
import minevalley.core.api.utils.command.Command;
import minevalley.core.api.utils.command.CommandOptions;
import minevalley.core.api.utils.command.PlayerCommand;

import java.util.List;

@CommandOptions(
        commands = {"example", "ex"},   // command-spelling and aliases (Always have to be written in lower case!)
        successMessage = "",    // message to print, if onCommand() returns SUCCESS
        fractions = {FractionService.POLICE},
        teamRanks = {TeamRank.DEVELOPMENT, TeamRank.ADMINISTRATION, TeamRank.SERVER_LEAD},
        requireSupportService = false,  // user has to be in support service (if false, option can be omitted)
        requireTeamService = false,     // user has to be in team service (if true, the teamranks-option is redundant)
        ignoreRanks = false,    // command is accessible for everyone without any specific rank (makes all ranks-options redundant)
        syntax = "example <necessary argument> [<unnecessary argument>]",   //correct syntax
        correctSyntaxLength = 0,    // correct number of arguments
        abuseWarning = false     // warning is sent into team-chat if user tries to perform this command without permission
)
public class ExampleCommand extends PlayerCommand {

    @Override
    public Command.CommandResponse onCommand(User user, String[] args) {

        // Command logic

        return Command.CommandResponse.SUCCESS;
    }

    // Can be omitted
    @Override
    public List<String> onTabComplete(User user, String[] args) {

        // Define tab-completions

        return null;
    }

    // Can be omitted
    @Override
    public boolean isPermissioned(User user) {

        // Define specific checks

        return true;
    }
}