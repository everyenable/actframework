package act.annotations;

/*-
 * #%L
 * ACT Framework
 * %%
 * Copyright (C) 2014 - 2018 ActFramework
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

import java.lang.annotation.*;

/**
 * Specifies the sort order for an annotated component
 *
 * When sorting a list of element with (potentially) the
 * `@Order` annotation, the one without the
 * annotation is put in the head of the list, followed
 * by the one with less order weight value and then
 * followed by the one with greater order weight value
 *
 * @see Sorted
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface Order {

    int HIGHEST_PRECEDENCE = Integer.MIN_VALUE;
    int LOWEST_PRECEDENCE = Integer.MAX_VALUE;

    /**
     * Specify the order weight.
     */
    int value();

}
