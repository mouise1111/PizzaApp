package be.ehb.pizzaapp.fragments;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;

import be.ehb.pizzaapp.R;

public class SizeDialogFragment extends DialogFragment {
    FragmentActivity activity;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        activity = (FragmentActivity) context;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder mBuilder = new AlertDialog.Builder(activity);

        mBuilder.setTitle("Select size");
        mBuilder.setSingleChoiceItems(R.array.pizza_sizes, 1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                String size = getResources().getStringArray(R.array.pizza_sizes)[i];
                Toast.makeText(activity, size, Toast.LENGTH_SHORT).show();
            }
        });
        mBuilder.setNegativeButton("Cancel", (dialogInterface, i) -> {

        });
        mBuilder.setPositiveButton("OK", (dialogInterface, i) -> {

        });
        return mBuilder.create();
    }
}
