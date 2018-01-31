/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.creator;

import command.EmptyCommand;
import command.UserCommand;
import interfaces.ActionCommand;

/**
 *
 * @author Melnikov
 */
public enum CreatorClassEnum {
    INDEX{{this.command = new EmptyCommand();}},
    USER{{this.command = new UserCommand();}},
    ;
    ActionCommand command;
    public ActionCommand getActionCommand(){
        return this.command;
    }
}
