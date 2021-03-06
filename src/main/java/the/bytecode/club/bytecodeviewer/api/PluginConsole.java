package the.bytecode.club.bytecodeviewer.api;

import the.bytecode.club.bytecodeviewer.gui.components.SystemConsole;
import the.bytecode.club.bytecodeviewer.plugin.PluginManager;

/***************************************************************************
 * Bytecode Viewer (BCV) - Java & Android Reverse Engineering Suite        *
 * Copyright (C) 2014 Kalen 'Konloch' Kinloch - http://bytecodeviewer.com  *
 *                                                                         *
 * This program is free software: you can redistribute it and/or modify    *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation, either version 3 of the License, or     *
 *   (at your option) any later version.                                   *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU General Public License     *
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>. *
 ***************************************************************************/

/**
 * A simple console GUI.
 *
 * @author Konloch
 */

public class PluginConsole extends SystemConsole
{
    private boolean showWindow;
    
    public PluginConsole(String pluginName)
    {
        super("Bytecode Viewer - Plugin Console - " + pluginName);
        
        PluginManager.addConsole(this);
    }
    
    @Override
    public void setVisible(boolean b)
    {
        //do nothing
        if(!showWindow)
            return;
        
        super.setVisible(b);
    }
    
    private static final long serialVersionUID = -6556940545421437508L;
}
