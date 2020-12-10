package com.vaadin.componentfactory.demo;

import com.vaadin.componentfactory.PasswordStrength;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.data.value.ValueChangeMode;
import com.vaadin.flow.demo.DemoView;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route("password-strength")
@RouteAlias("")
public class PasswordStrengthView extends DemoView {

    @Override
    protected void initView() {
        PasswordField passwordField = new PasswordField();
        passwordField.setLabel("Press enter for change");
        PasswordStrength passwordStrength = new PasswordStrength();
        Div text = new Div();

        passwordField.setValueChangeMode(ValueChangeMode.EAGER);
        passwordField.addValueChangeListener(changeEvent -> {
            passwordStrength.setStrength(changeEvent.getValue().length() / 3);
            text.setText("Password strength set to " + passwordStrength.getStrength());
        });

        addCard("Basic Password Strength setting usage", passwordField, passwordStrength, text);
    }
}