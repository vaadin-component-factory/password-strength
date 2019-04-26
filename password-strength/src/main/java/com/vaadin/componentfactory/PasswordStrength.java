package com.vaadin.componentfactory;

/*
 * #%L
 * Password Strength for Vaadin 10
 * %%
 * Copyright (C) 2017 - 2019 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).

 * See the file license.html distributed with this software for more
 * information about licensing.

 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <http://vaadin.com/license/cval-3>.
 * #L%
 */


import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Server-side component for the <code>vcf-password-strength</code> element.
 *
 * @author Vaadin Ltd
 */
@Tag("vcf-password-strength")
@HtmlImport("frontend://bower_components/vcf-password-strength/src/vcf-password-strength.html")
public class PasswordStrength extends PolymerTemplate<PasswordStrength.PasswordStrengthModel> {

    /**
     * Setting strength for indication. From 0 to 5. Everything that bigger 5 have same affect as 5
     *
     * @param count
     */
    public void setStrength(int count) {
        getModel().setStrength(count);
    }

    /**
     *  Getting strength indication
     *
     * @return strength indication
     */
    public int getStrength() {
        return getModel().getStrength();
    }

    /**
     * This model binds properties between java(PasswordStrength) and polymer(vcf-password-strength.html)
     */
    public interface PasswordStrengthModel extends TemplateModel {
        void setStrength(int count);
        int getStrength();
    }
}
