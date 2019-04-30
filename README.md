# Component Factory Password Strength for Vaadin 10+

[Live Demo ↗](https://incubator.app.fi/password-strength-demo/password-strength)

# What does the component do?

Password Strength is server-side component of [&lt;vcf-password-strength&gt;](https://github.com/vaadin-component-factory/vcf-password-strength) web component for Vaadin 10. 
It provides a strength indicator for a password field. 

[<img src="https://raw.githubusercontent.com/vaadin/incubator-password-strength/master/screenshot.gif" width="200" alt="Screenshot of incubator-password-strength">](https://vaadin.com/directory/component/vaadin-component-factoryvcf-password-strength)

### Vaadin Prime
This component is available in of Vaadin Prime subscription. It is still open source, but you need to have a valid CVAL license in order to use it. Read more at: https://vaadin.com/pricing

## Usage

Strength can be set from 0 to 5. Strength represent number of blocks that would be filled with color and color of fill
ling(0 - nothing, 1 - red, 2 - orange, 3 - yellow, 4 - light green, 5 - dark green). Setting strength to more then 5 will make no difference from just setting it to 5.

```
PasswordStrength passwordStrength = new PasswordStrength();
passwordStrength.setStrength(4);
```
Setting strength to 4 mean will indicate good password strength. 

Common use case would be to track changes of PasswordField and then calculating and setting strength on every change: 
```
passwordField.addValueChangeListener(changeEvent -> {
    passwordStrength.setStrength(changeEvent.getValue().length() / 3);
});
```  

## Demo
To run demo go to `password-strength-demo/` subfolder and run `mvn jetty:run`.
After server startup, you'll be able find demo at [http://localhost:8080/password-strength](http://localhost:8080/password-strength)

## Setting up for development:

Clone the project in GitHub (or fork it if you plan on contributing)

```
https://github.com/vaadin/password-strength
```

To build and install the project into the local repository run 

```mvn install ```

## License & Author

This Add-on is distributed under [Commercial Vaadin Add-on License version 3](http://vaadin.com/license/cval-3) (CVALv3). For license terms, see LICENSE.txt.

Password Strength is written by Vaadin Ltd.

