/*******************************************************************************
 * Copyright (c) 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.osgi.service.debug;

public interface DebugOptions {
	public abstract boolean getBooleanOption(String option, boolean defaultValue);
	public abstract String getOption(String option);
	public abstract int getIntegerOption(String option, int defaultValue);
	public abstract void setOption(String option, String value);
}