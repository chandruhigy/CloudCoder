// CloudCoder - a web-based pedagogical programming environment
// Copyright (C) 2011-2012, Jaime Spacco <jspacco@knox.edu>
// Copyright (C) 2011-2012, David H. Hovemeyer <david.hovemeyer@gmail.com>
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

package org.cloudcoder.app.server.submitsvc;

import org.cloudcoder.app.shared.model.SubmissionException;
import org.cloudcoder.app.shared.model.SubmissionResult;

/**
 * An object representing a submission (problem and program text)
 * that is in the process of being compiled and tested by
 * an {@link ISubmitService}.  It is expected that compilation/testing
 * with either complete in a timely manner, or will gracefully time out.
 * So, it is required that {@link IFutureSubmissionResult#poll()}
 * return a non-null value after some reasonable interval.
 * 
 * @author David Hovemeyer
 */
public interface IFutureSubmissionResult {
	/**
	 * Check to see if compilation/testing has completed for the submission.
	 * 
	 * @return a {@link SubmissionResult} if compilation/testing has completed,
	 *         or null if compilation/testing is still in progress
	 * @throws SubmissionException
	 */
	public SubmissionResult poll() throws SubmissionException;
}
