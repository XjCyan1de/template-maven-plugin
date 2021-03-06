/*
 * This file is part of Template Maven Plugin.
 *
 * Copyright (c) 2013 Wolf480pl <wolf480@interia.pl>
 * Template Maven Plugin is licensed under the GNU Lesser General Public License.
 *
 * Template Maven Plugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Template Maven Plugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.wolf480pl.maven_plugins.template_maven_plugin;

import org.apache.maven.plugin.logging.Log;

public class MavenLog implements Logging {
    private final Log log;

    public MavenLog(Log log) {
        this.log = log;
    }

    @Override
    public void info(CharSequence message) {
        this.log.info(message);
    }

    @Override
    public void error(CharSequence message, Throwable t) {
        this.log.error(message, t);
    }

    @Override
    public void warn(CharSequence message) {
        this.log.warn(message);
    }

}
