package com.example.roshan.nepxchange.Base;

import android.app.Dialog;
import android.support.v4.app.Fragment;
import android.util.DisplayMetrics;

import com.example.roshan.nepxchange.Utility.DialogUtility;

public class BaseFragment extends Fragment {
    private Dialog mProgressDialog;

//    public FragmentComponent getFragmentComponent() {
//        Injector.initialiseFragmentComponent(this);
//        return Injector.getFragmentComponent();
//    }

    public int getScreenInches() {
        DisplayMetrics dm = getActivity().getResources().getDisplayMetrics();
        double density = dm.density * 160;
        double x = Math.pow(dm.widthPixels / density, 2);
        double y = Math.pow(dm.heightPixels / density, 2);
        double screenInches = Math.sqrt(x + y);
        return (int) screenInches;
    }

    public void showCustomDialogProgress(){

        mProgressDialog = DialogUtility.getProgressDialog(getActivity());
        mProgressDialog.setCancelable(false);
        mProgressDialog.show();
    }

    public void hideProgressDialogGlobal(){
        if (mProgressDialog != null && mProgressDialog.isShowing()) {
            mProgressDialog.cancel();
        }
    }

}
