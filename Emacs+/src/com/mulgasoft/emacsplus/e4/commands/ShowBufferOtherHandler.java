/**
 * Copyright (c) 2009, 2014 Mark Feber, MulgaSoft
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.mulgasoft.emacsplus.e4.commands;

import org.eclipse.e4.core.contexts.IEclipseContext;

import com.mulgasoft.emacsplus.EmacsPlusActivator;

/**
 * Prompt for a buffer and display it in another frame. If:
 *  - only one stack, then split and display new buffer
 *  - multiple stacks, move buffer to adjacent stack if not in destination stack,
 *  - else simply expose in destination stack
 *  
 *  When splitting, split horizontally unless called with ^U
 *  
 * @author mfeber - Initial API and implementation
 */
public class ShowBufferOtherHandler extends SwitchToBufferOtherHandler {

	private static final String PREFIX = EmacsPlusActivator.getResourceString("Display_Other_Buffer"); //$NON-NLS-1$ 

	@Override
	protected void addToContext(IEclipseContext ctx) {
		super.addToContext(ctx);
		ctx.set(E4CmdHandler.CMD_CTX_KEY, true);		
		ctx.set(E4CmdHandler.PRE_CTX_KEY, PREFIX);
	}
}
