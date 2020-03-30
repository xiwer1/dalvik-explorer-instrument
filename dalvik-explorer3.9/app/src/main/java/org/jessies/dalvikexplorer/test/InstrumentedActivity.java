package org.jessies.dalvikexplorer.test;


import org.jessies.dalvikexplorer.DalvikExplorerActivity;

public class InstrumentedActivity extends DalvikExplorerActivity {
    public FinishListener finishListener ;
    public void  setFinishListener(FinishListener finishListener){
        this.finishListener = finishListener;
    }

    @Override
    public void onDestroy() {
        if (this.finishListener !=null){
            finishListener.onActivityFinished();
        }
        super.onDestroy();
    }

}