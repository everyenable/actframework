package act.handler.builtin;

/*-
 * #%L
 * ACT Framework
 * %%
 * Copyright (C) 2014 - 2017 ActFramework
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

import act.app.ActionContext;
import act.app.App;

import java.io.File;

public class AuthenticatedFileGetter extends FileGetter {

    public AuthenticatedFileGetter(String base, App app) {
        super(base, app);
    }

    public AuthenticatedFileGetter(File base) {
        super(base);
    }

    @Override
    public boolean sessionFree() {
        return false;
    }

    @Override
    public void prepareAuthentication(ActionContext context) {
    }

}
