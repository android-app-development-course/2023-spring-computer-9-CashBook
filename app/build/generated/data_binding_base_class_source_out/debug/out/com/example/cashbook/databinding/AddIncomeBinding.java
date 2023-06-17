// Generated by view binder compiler. Do not edit!
package com.example.cashbook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cashbook.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class AddIncomeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button addBt;

  @NonNull
  public final TextView chooseDate;

  @NonNull
  public final CardView dataInput;

  @NonNull
  public final CardView iconSelect;

  @NonNull
  public final GridView inTypeList;

  @NonNull
  public final EditText money;

  @NonNull
  public final EditText remarkText;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView2;

  @NonNull
  public final TextView textView3;

  private AddIncomeBinding(@NonNull LinearLayout rootView, @NonNull Button addBt,
      @NonNull TextView chooseDate, @NonNull CardView dataInput, @NonNull CardView iconSelect,
      @NonNull GridView inTypeList, @NonNull EditText money, @NonNull EditText remarkText,
      @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.addBt = addBt;
    this.chooseDate = chooseDate;
    this.dataInput = dataInput;
    this.iconSelect = iconSelect;
    this.inTypeList = inTypeList;
    this.money = money;
    this.remarkText = remarkText;
    this.textView = textView;
    this.textView2 = textView2;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static AddIncomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static AddIncomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.add_income, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static AddIncomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addBt;
      Button addBt = ViewBindings.findChildViewById(rootView, id);
      if (addBt == null) {
        break missingId;
      }

      id = R.id.chooseDate;
      TextView chooseDate = ViewBindings.findChildViewById(rootView, id);
      if (chooseDate == null) {
        break missingId;
      }

      id = R.id.data_input;
      CardView dataInput = ViewBindings.findChildViewById(rootView, id);
      if (dataInput == null) {
        break missingId;
      }

      id = R.id.icon_select;
      CardView iconSelect = ViewBindings.findChildViewById(rootView, id);
      if (iconSelect == null) {
        break missingId;
      }

      id = R.id.inTypeList;
      GridView inTypeList = ViewBindings.findChildViewById(rootView, id);
      if (inTypeList == null) {
        break missingId;
      }

      id = R.id.money;
      EditText money = ViewBindings.findChildViewById(rootView, id);
      if (money == null) {
        break missingId;
      }

      id = R.id.remarkText;
      EditText remarkText = ViewBindings.findChildViewById(rootView, id);
      if (remarkText == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView2;
      TextView textView2 = ViewBindings.findChildViewById(rootView, id);
      if (textView2 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new AddIncomeBinding((LinearLayout) rootView, addBt, chooseDate, dataInput, iconSelect,
          inTypeList, money, remarkText, textView, textView2, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
