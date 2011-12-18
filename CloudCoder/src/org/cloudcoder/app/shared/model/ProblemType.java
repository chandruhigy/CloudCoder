// CloudCoder - a web-based pedagogical programming environment
// Copyright (C) 2011, Jaime Spacco <jspacco@knox.edu>
// Copyright (C) 2011, David H. Hovemeyer <dhovemey@ycp.edu>
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.

package org.cloudcoder.app.shared.model;

/**
 * Problem type enumeration.
 * In general, CloudCoder can support many kinds of problems in
 * many programming languages.  This enumeration represents the
 * various kinds of problems.
 * 
 * @author David Hovemeyer
 */
public enum ProblemType {
	/**
	 * Problem involving writing a complete Java method.
	 */
	JAVA_METHOD,
	PYTHON_FUNCTION,
	C_FUNCTION,
}