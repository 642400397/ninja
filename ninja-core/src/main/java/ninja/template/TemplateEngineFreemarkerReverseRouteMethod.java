/**
 * Copyright (C) 2012-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ninja.template;

import java.util.List;

import ninja.Context;
import ninja.Result;
import ninja.i18n.Messages;

import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import freemarker.template.SimpleNumber;
import freemarker.template.SimpleScalar;
import freemarker.template.TemplateMethodModelEx;
import freemarker.template.TemplateModel;
import freemarker.template.TemplateModelException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ninja.Router;

@Singleton
public class TemplateEngineFreemarkerReverseRouteMethod implements
        TemplateMethodModelEx {

    final Router router;
    final TemplateEngineFreemarkerReverseRouteHelper templateEngineFreemarkerReverseRouteHelper;

    @Inject
    public TemplateEngineFreemarkerReverseRouteMethod(
            Router router,
            TemplateEngineFreemarkerReverseRouteHelper templateEngineFreemarkerReverseRouteHelper) {
        
        this.router = router;
        this.templateEngineFreemarkerReverseRouteHelper = templateEngineFreemarkerReverseRouteHelper;

    }

    public TemplateModel exec(List args) throws TemplateModelException {

       return templateEngineFreemarkerReverseRouteHelper.computeReverseRoute(args);

    }
}
