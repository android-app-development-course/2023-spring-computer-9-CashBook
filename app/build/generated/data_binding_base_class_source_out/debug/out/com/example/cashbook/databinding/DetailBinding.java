// Generated by view binder compiler. Do not edit!
package com.example.cashbook.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.cashbook.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DetailBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView detailDate;

  @NonNull
  public final TextView detailInOut;

  @NonNull
  public final TextView detailMoney;

  @NonNull
  public final TextView detailRemark;

  @NonNull
  public final TextView detailType;

  @NonNull
  public final TextView textView;

  @NonNull
  public final TextView textView0;

  @NonNull
  public final TextView textView3;

  private DetailBinding(@NonNull LinearLayout rootView, @NonNull TextView detailDate,
      @NonNull TextView detailInOut, @NonNull TextView detailMoney, @NonNull TextView detailRemark,
      @NonNull TextView detailType, @NonNull TextView textView, @NonNull TextView textView0,
      @NonNull TextView textView3) {
    this.rootView = rootView;
    this.detailDate = detailDate;
    this.detailInOut = detailInOut;
    this.detailMoney = detailMoney;
    this.detailRemark = detailRemark;
    this.detailType = detailType;
    this.textView = textView;
    this.textView0 = textView0;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.detail, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DetailBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.detailDate;
      TextView detailDate = ViewBindings.findChildViewById(rootView, id);
      if (detailDate == null) {
        break missingId;
      }

      id = R.id.detailInOut;
      TextView detailInOut = ViewBindings.findChildViewById(rootView, id);
      if (detailInOut == null) {
        break missingId;
      }

      id = R.id.detailMoney;
      TextView detailMoney = ViewBindings.findChildViewById(rootView, id);
      if (detailMoney == null) {
        break missingId;
      }

      id = R.id.detailRemark;
      TextView detailRemark = ViewBindings.findChildViewById(rootView, id);
      if (detailRemark == null) {
        break missingId;
      }

      id = R.id.detailType;
      TextView detailType = ViewBindings.findChildViewById(rootView, id);
      if (detailType == null) {
        break missingId;
      }

      id = R.id.textView;
      TextView textView = ViewBindings.findChildViewById(rootView, id);
      if (textView == null) {
        break missingId;
      }

      id = R.id.textView0;
      TextView textView0 = ViewBindings.findChildViewById(rootView, id);
      if (textView0 == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new DetailBinding((LinearLayout) rootView, detailDate, detailInOut, detailMoney,
          detailRemark, detailType, textView, textView0, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
