package org.example;

public class Userinterface {


    private final MainLogic mainLogic;


    public Userinterface(MainLogic mainLogic) {
        this.mainLogic = mainLogic;
    }
    public void start(){
        mainLogic.startProgramm();
    }
    public void addNewAnimal(){
        mainLogic.addAnimal();
    }
    public void addNewCommand(){
        mainLogic.addCommand();
    }
    public void showCommands(){
        mainLogic.showCommands();
    }

}

