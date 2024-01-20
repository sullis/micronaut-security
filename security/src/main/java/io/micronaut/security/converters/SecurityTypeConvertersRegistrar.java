/*
 * Copyright 2017-2024 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.micronaut.security.converters;

import io.micronaut.core.annotation.Internal;
import io.micronaut.core.convert.MutableConversionService;
import io.micronaut.core.convert.TypeConverterRegistrar;

import java.security.Principal;

/**
 * Registers security {@link io.micronaut.core.convert.TypeConverter}s.
 * @author Sergio del Amo
 * @since 4.5.0
 */
@Internal
public final class SecurityTypeConvertersRegistrar implements TypeConverterRegistrar {
    @Override
    public void register(MutableConversionService conversionService) {
        conversionService.addConverter(Principal.class, String.class, new PrincipalToStringConverter());
    }
}