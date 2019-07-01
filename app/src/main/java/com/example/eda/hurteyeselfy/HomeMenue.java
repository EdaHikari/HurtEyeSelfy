package com.example.eda.hurteyeselfy;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link HomeMenue.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link HomeMenue#newInstance} factory method to
 * create an instance of this fragment.
 */
public class HomeMenue extends Fragment {

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.descriptionButton: {

                break;
            }

            case R.id.selectimageButton: {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                Fragment fragment = new Processing_Fragment();
                Bundle args = new Bundle();
                // args.putString("dir", String.valueOf(mFile));
                //Bitmap data = AutoFitTextureView.getBitmap();
                args.putInt("pheight", pheight);
                args.putInt("pwidth", pwidth);
                fragment.setArguments(args);
                transaction.replace(R.id.container, fragment);
                transaction.addToBackStack(null);
                transaction.commit();
                break;
            }

            case R.id.takepictureButton: {
                Activity activity = getActivity();
                if (null != activity) {
                    new AlertDialog.Builder(activity)
                            .setMessage(R.string.intro_message)
                            .setPositiveButton(android.R.string.ok, null)
                            .show();
                }
                break;
            }
        }
    }
}
