/**
 * Copyright (c) 2009, 2014 Mark Feber, MulgaSoft
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 */
package com.mulgasoft.emacsplus.e4.commands;

/**
 * Implements: other-window
 * 
 * Activate the next most recent editor
 * 
 * @author Mark Feber - initial API and implementation
 */
public class WindowOtherHandler extends E4WindowHandler<WindowOtherCmd> {
	public WindowOtherHandler() {
		super(WindowOtherCmd.class);
	}
}
