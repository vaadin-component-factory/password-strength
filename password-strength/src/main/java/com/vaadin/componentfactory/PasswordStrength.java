package com.vaadin.componentfactory;

/*
 * #%L
 * Password Strength for Vaadin 10
 * %%
 * Copyright (C) 2017 - 2019 Vaadin Ltd
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */


import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.dependency.NpmPackage;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.templatemodel.TemplateModel;

/**
 * Server-side component for the <code>vcf-password-strength</code> element.
 *
 * @author Vaadin Ltd
 */
@Tag("vcf-password-strength")
@HtmlImport("frontend://bower_components/vcf-password-strength/src/vcf-password-strength.html")
@NpmPackage(value = "@vaadin-component-factory/vcf-password-strength", version = "1.0.2")
@JsModule("@vaadin-component-factory/vcf-password-strength/src/vcf-password-strength.js")
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
