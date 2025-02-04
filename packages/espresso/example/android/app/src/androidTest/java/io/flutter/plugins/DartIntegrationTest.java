// Copyright 2013 The Flutter Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

package io.flutter.plugins;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Annotation to aid flutter_plugin_tools in determining if a test is a native
 * java unit test OR a java class with a dart integration.
 *
 * See: https://github.com/flutter/flutter/wiki/Plugin-Tests#enabling-android-ui-tests
 * for more infomation.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface DartIntegrationTest {}
