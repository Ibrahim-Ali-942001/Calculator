// Generated by view binder compiler. Do not edit!
package com.example.simplecalculator.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.simplecalculator.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCalculatorControllerBinding implements ViewBinding {
  @NonNull
  private final TableLayout rootView;

  @NonNull
  public final Button buttonAC;

  @NonNull
  public final Button buttonAdd;

  @NonNull
  public final Button buttonDecimal;

  @NonNull
  public final Button buttonDivide;

  @NonNull
  public final Button buttonEight;

  @NonNull
  public final Button buttonEquals;

  @NonNull
  public final Button buttonFive;

  @NonNull
  public final Button buttonFour;

  @NonNull
  public final Button buttonMinus;

  @NonNull
  public final Button buttonMultiply;

  @NonNull
  public final Button buttonNine;

  @NonNull
  public final Button buttonOne;

  @NonNull
  public final Button buttonSeven;

  @NonNull
  public final Button buttonSix;

  @NonNull
  public final Button buttonThree;

  @NonNull
  public final Button buttonTwo;

  @NonNull
  public final Button buttonZero;

  @NonNull
  public final TextView resultTextview;

  private ActivityCalculatorControllerBinding(@NonNull TableLayout rootView,
      @NonNull Button buttonAC, @NonNull Button buttonAdd, @NonNull Button buttonDecimal,
      @NonNull Button buttonDivide, @NonNull Button buttonEight, @NonNull Button buttonEquals,
      @NonNull Button buttonFive, @NonNull Button buttonFour, @NonNull Button buttonMinus,
      @NonNull Button buttonMultiply, @NonNull Button buttonNine, @NonNull Button buttonOne,
      @NonNull Button buttonSeven, @NonNull Button buttonSix, @NonNull Button buttonThree,
      @NonNull Button buttonTwo, @NonNull Button buttonZero, @NonNull TextView resultTextview) {
    this.rootView = rootView;
    this.buttonAC = buttonAC;
    this.buttonAdd = buttonAdd;
    this.buttonDecimal = buttonDecimal;
    this.buttonDivide = buttonDivide;
    this.buttonEight = buttonEight;
    this.buttonEquals = buttonEquals;
    this.buttonFive = buttonFive;
    this.buttonFour = buttonFour;
    this.buttonMinus = buttonMinus;
    this.buttonMultiply = buttonMultiply;
    this.buttonNine = buttonNine;
    this.buttonOne = buttonOne;
    this.buttonSeven = buttonSeven;
    this.buttonSix = buttonSix;
    this.buttonThree = buttonThree;
    this.buttonTwo = buttonTwo;
    this.buttonZero = buttonZero;
    this.resultTextview = resultTextview;
  }

  @Override
  @NonNull
  public TableLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCalculatorControllerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCalculatorControllerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_calculator_controller, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCalculatorControllerBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonAC;
      Button buttonAC = ViewBindings.findChildViewById(rootView, id);
      if (buttonAC == null) {
        break missingId;
      }

      id = R.id.buttonAdd;
      Button buttonAdd = ViewBindings.findChildViewById(rootView, id);
      if (buttonAdd == null) {
        break missingId;
      }

      id = R.id.buttonDecimal;
      Button buttonDecimal = ViewBindings.findChildViewById(rootView, id);
      if (buttonDecimal == null) {
        break missingId;
      }

      id = R.id.buttonDivide;
      Button buttonDivide = ViewBindings.findChildViewById(rootView, id);
      if (buttonDivide == null) {
        break missingId;
      }

      id = R.id.buttonEight;
      Button buttonEight = ViewBindings.findChildViewById(rootView, id);
      if (buttonEight == null) {
        break missingId;
      }

      id = R.id.buttonEquals;
      Button buttonEquals = ViewBindings.findChildViewById(rootView, id);
      if (buttonEquals == null) {
        break missingId;
      }

      id = R.id.buttonFive;
      Button buttonFive = ViewBindings.findChildViewById(rootView, id);
      if (buttonFive == null) {
        break missingId;
      }

      id = R.id.buttonFour;
      Button buttonFour = ViewBindings.findChildViewById(rootView, id);
      if (buttonFour == null) {
        break missingId;
      }

      id = R.id.buttonMinus;
      Button buttonMinus = ViewBindings.findChildViewById(rootView, id);
      if (buttonMinus == null) {
        break missingId;
      }

      id = R.id.buttonMultiply;
      Button buttonMultiply = ViewBindings.findChildViewById(rootView, id);
      if (buttonMultiply == null) {
        break missingId;
      }

      id = R.id.buttonNine;
      Button buttonNine = ViewBindings.findChildViewById(rootView, id);
      if (buttonNine == null) {
        break missingId;
      }

      id = R.id.buttonOne;
      Button buttonOne = ViewBindings.findChildViewById(rootView, id);
      if (buttonOne == null) {
        break missingId;
      }

      id = R.id.buttonSeven;
      Button buttonSeven = ViewBindings.findChildViewById(rootView, id);
      if (buttonSeven == null) {
        break missingId;
      }

      id = R.id.buttonSix;
      Button buttonSix = ViewBindings.findChildViewById(rootView, id);
      if (buttonSix == null) {
        break missingId;
      }

      id = R.id.buttonThree;
      Button buttonThree = ViewBindings.findChildViewById(rootView, id);
      if (buttonThree == null) {
        break missingId;
      }

      id = R.id.buttonTwo;
      Button buttonTwo = ViewBindings.findChildViewById(rootView, id);
      if (buttonTwo == null) {
        break missingId;
      }

      id = R.id.buttonZero;
      Button buttonZero = ViewBindings.findChildViewById(rootView, id);
      if (buttonZero == null) {
        break missingId;
      }

      id = R.id.result_textview;
      TextView resultTextview = ViewBindings.findChildViewById(rootView, id);
      if (resultTextview == null) {
        break missingId;
      }

      return new ActivityCalculatorControllerBinding((TableLayout) rootView, buttonAC, buttonAdd,
          buttonDecimal, buttonDivide, buttonEight, buttonEquals, buttonFive, buttonFour,
          buttonMinus, buttonMultiply, buttonNine, buttonOne, buttonSeven, buttonSix, buttonThree,
          buttonTwo, buttonZero, resultTextview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
