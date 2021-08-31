package org.java.training.autumn;

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private boolean activeState;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
        this.activeState = true;
    }

    public void processUser(){
        Scanner sc = new Scanner(System.in);
        view.displayMenu();
        while(activeState){
            if(sc.hasNextInt()){
                int current = sc.nextInt();
                if(!model.checkInRange(current)){
                    view.printMessage(View.OUT_OF_RANGE_MESSAGE);
                    view.displayRange(model.getMin(), model.getMax());
                }
                else{
                    if(model.checkEquals(current)){activeState=false;};
                    view.displayRange(model.getMin(), model.getMax());
                    view.displayStatistic(model.getStatistics());
                }
            }
            else {
                view.printMessage(View.ERR_MESSAGE);
                view.printMessage(View.HELP_MESSAGE);
                sc.next();
            }
        }
    }
}
