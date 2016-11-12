/*
 *
 *  Copyright (C) 2000 Silicon Graphics, Inc.  All Rights Reserved.
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  Further, this software is distributed without any warranty that it is
 *  free of the rightful claim of any third person regarding infringement
 *  or the like.  Any license provided herein, whether implied or
 *  otherwise, applies only to this software file.  Patent licenses, if
 *  any, provided herein do not apply to combinations of this program with
 *  other software, or any other product whatsoever.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 *  Contact information: Silicon Graphics, Inc., 1600 Amphitheatre Pkwy,
 *  Mountain View, CA  94043, or:
 *
 *  http://www.sgi.com
 *
 *  For further information regarding this notice, see:
 *
 *  http://oss.sgi.com/projects/GenInfo/NoticeExplan/
 *
 */

/*
 * Copyright (C) 1990-93   Silicon Graphics, Inc.
 * Author(s): Alain Dumesny
 * Ported to Qt4 by MeVis (http://www.mevis.de), 2006
 */

package jsceneviewer.inventor.qt;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.graphics.ImageData;
import org.eclipse.swt.graphics.PaletteData;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Display;

import jsceneviewer.Activator;

/**
 * @author Yves Boyadjian
 *
 */
public class SoQtIcons {
	public

	    enum IconNum {
	        ICON_PICK,
	        ICON_VIEW,
	        ICON_HELP,
	        ICON_HOME,
	        ICON_SET_HOME,
	        ICON_VIEW_ALL,
	        ICON_SEEK,
	        ICON_ORTHO,
	        ICON_PERSP,
	        ICON_X,
	        ICON_Y,
	        ICON_Z,
	        ICON_COUNT
	    };

	    public enum CursorNum {
	        CURSOR_VIEWING,
	        CURSOR_CURVED_HAND,
	        CURSOR_FLAT_HAND,
	        CURSOR_POINTING_HAND,
	        CURSOR_ROLL,
	        CURSOR_TARGET,
	        CURSOR_NORMAL_VEC,
	        CURSOR_WALK,
	        CURSOR_PAN,
	        CURSOR_TILT,
	        CURSOR_COUNT
	    };
	    
	    private final static int so_qt_icon_width = 24;
	    private final static int so_qt_icon_height = 24;

	    static final  short so_qt_pick_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0x00, 0x00, 0x80, 0x01, 0x00,
	       0x80, 0x03, 0x00, 0x80, 0x07, 0x00, 0x80, 0x0f, 0x00, 0x80, 0x1f, 0x00,
	       0x80, 0x3f, 0x00, 0x80, 0x7f, 0x00, 0x80, 0xff, 0x00, 0x80, 0xff, 0x01,
	       0x80, 0xff, 0x03, 0x80, 0xff, 0x00, 0x80, 0x3f, 0x00, 0x80, 0x77, 0x00,
	       0x80, 0x71, 0x00, 0x00, 0xe0, 0x00, 0x00, 0xe0, 0x00, 0x00, 0xc0, 0x01,
	       0x00, 0xc0, 0x01, 0x00, 0x80, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

	    static final  short so_qt_view_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x06, 0x00, 0x70, 0x69, 0x00, 0x88, 0x91, 0x00,
	       0x08, 0x33, 0x01, 0x30, 0x66, 0x02, 0x20, 0x44, 0x04, 0x40, 0xcc, 0x04,
	       0x80, 0x88, 0x08, 0x84, 0x08, 0x08, 0x9a, 0x00, 0x08, 0xa2, 0x00, 0x10,
	       0xa2, 0x00, 0x10, 0x44, 0x00, 0x10, 0x08, 0x00, 0x10, 0x08, 0x00, 0x20,
	       0x10, 0x00, 0x20, 0xe0, 0x00, 0x20, 0x00, 0x03, 0x20, 0x00, 0x04, 0x20,
	       0x00, 0x08, 0x40, 0x00, 0x10, 0x80, 0x00, 0x20, 0x00, 0x00, 0x40, 0x00};

	    static final  short so_qt_help_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x3e, 0x00, 0x00, 0x73, 0x00,
	       0x00, 0x77, 0x00, 0x00, 0x77, 0x00, 0x00, 0x72, 0x00, 0x00, 0x30, 0x00,
	       0x00, 0x18, 0x00, 0x00, 0x08, 0x00, 0x00, 0x08, 0x00, 0x00, 0x00, 0x00,
	       0x00, 0x1c, 0x00, 0x00, 0x1c, 0x00, 0x00, 0x1c, 0x00, 0x00, 0x00, 0x00,
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

	    static final  short so_qt_home_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
	       0x80, 0x09, 0x00, 0x80, 0x1d, 0x00, 0x80, 0x37, 0x00, 0x80, 0x63, 0x00,
	       0x80, 0xc1, 0x00, 0xc0, 0x80, 0x01, 0x60, 0x0e, 0x03, 0x70, 0x0a, 0x07,
	       0x58, 0x0e, 0x0d, 0x48, 0x00, 0x09, 0x40, 0x00, 0x01, 0x40, 0x00, 0x01,
	       0x40, 0x38, 0x01, 0x40, 0x28, 0x01, 0x40, 0x28, 0x01, 0x40, 0x28, 0x01,
	       0xc0, 0xff, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

	    static final  short so_qt_set_home_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xc0, 0x00, 0x00, 0xe2,
	       0x80, 0x09, 0x76, 0x80, 0x1d, 0x3e, 0x80, 0x37, 0x1e, 0x80, 0x63, 0x3e,
	       0x80, 0xc1, 0x7e, 0xc0, 0x80, 0x01, 0x60, 0x0e, 0x03, 0x70, 0x0a, 0x07,
	       0x58, 0x0e, 0x0d, 0x48, 0x00, 0x09, 0x40, 0x00, 0x01, 0x40, 0x00, 0x01,
	       0x40, 0x38, 0x01, 0x40, 0x28, 0x01, 0x40, 0x28, 0x01, 0x40, 0x28, 0x01,
	       0xc0, 0xff, 0x01, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

	    static final  short so_qt_see_all_bits[] = {
	       0x00, 0x00, 0x00, 0x20, 0x42, 0x04, 0x44, 0x24, 0x22, 0x88, 0xff, 0x11,
	       0x90, 0x00, 0x09, 0x62, 0x3c, 0x46, 0x14, 0xc3, 0x28, 0x08, 0x99, 0x10,
	       0x86, 0x3c, 0x61, 0x08, 0x99, 0x10, 0x18, 0xc3, 0x18, 0x64, 0x3c, 0x26,
	       0xa2, 0x81, 0x45, 0x90, 0xff, 0x09, 0x88, 0x24, 0x13, 0xc0, 0x24, 0x06,
	       0x60, 0x42, 0x0c, 0x30, 0x00, 0x08, 0x10, 0x00, 0x18, 0x18, 0xc2, 0x30,
	       0x8c, 0x83, 0x63, 0x86, 0x87, 0x43, 0x82, 0x00, 0x47, 0x00, 0x00, 0x02};

	    static final  short so_qt_seek_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x1c, 0x00, 0x00, 0x1c, 0x00,
	       0x00, 0x1c, 0x00, 0x00, 0x3e, 0x00, 0x80, 0xc9, 0x00, 0x40, 0x08, 0x01,
	       0x40, 0x08, 0x01, 0x20, 0x08, 0x02, 0x3c, 0x00, 0x1e, 0xfc, 0xe3, 0x1f,
	       0x3c, 0x00, 0x1e, 0x20, 0x08, 0x02, 0x40, 0x08, 0x01, 0x40, 0x08, 0x01,
	       0x80, 0xc9, 0x00, 0x00, 0x3e, 0x00, 0x00, 0x1c, 0x00, 0x00, 0x1c, 0x00,
	       0x00, 0x1c, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

	    static final  short so_qt_ortho_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x1e, 0x00, 0x00, 0x65, 0x00,
	       0x80, 0x84, 0x01, 0x40, 0x04, 0x06, 0x20, 0x04, 0x18, 0x10, 0x04, 0x18,
	       0x08, 0x04, 0x14, 0x38, 0x04, 0x12, 0xc8, 0x04, 0x11, 0x08, 0x87, 0x10,
	       0x08, 0x5e, 0x10, 0x08, 0x71, 0x10, 0x88, 0xa0, 0x11, 0x48, 0x20, 0x16,
	       0x28, 0x20, 0x18, 0x18, 0x20, 0x08, 0x18, 0x20, 0x04, 0x60, 0x20, 0x02,
	       0x80, 0x21, 0x01, 0x00, 0xa6, 0x00, 0x00, 0x78, 0x00, 0x00, 0x00, 0x00};

	    static final  short so_qt_persp_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x04, 0x00, 0x00, 0x1e, 0x00, 0x00, 0x65, 0x00,
	       0x00, 0x85, 0x01, 0x80, 0x04, 0x06, 0x80, 0x04, 0x18, 0x40, 0x04, 0x1c,
	       0x40, 0x04, 0x12, 0x20, 0x04, 0x11, 0x20, 0xc4, 0x10, 0x10, 0x24, 0x10,
	       0x10, 0x1a, 0x10, 0x08, 0x69, 0x10, 0xb8, 0x84, 0x11, 0xc8, 0x03, 0x16,
	       0x28, 0x01, 0x18, 0x18, 0x01, 0x0f, 0x38, 0xf1, 0x00, 0xc0, 0x0f, 0x00,
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

	    static final  short so_qt_X_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xc0, 0xc7, 0x07, 0x80, 0x83, 0x03,
	       0x00, 0x87, 0x01, 0x00, 0xc6, 0x00, 0x00, 0x6c, 0x00, 0x00, 0x38, 0x00,
	       0x00, 0x38, 0x00, 0x00, 0x78, 0x00, 0x00, 0xfc, 0x00, 0x00, 0xe6, 0x00,
	       0x00, 0xc3, 0x01, 0x80, 0x83, 0x03, 0xc0, 0xe7, 0x07, 0x00, 0x00, 0x00,
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

	    static final  short so_qt_Y_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0xc0, 0x8f, 0x07, 0x80, 0x07, 0x03,
	       0x00, 0x87, 0x01, 0x00, 0x8f, 0x00, 0x00, 0xde, 0x00, 0x00, 0x5c, 0x00,
	       0x00, 0x7c, 0x00, 0x00, 0x38, 0x00, 0x00, 0x38, 0x00, 0x00, 0x38, 0x00,
	       0x00, 0x38, 0x00, 0x00, 0x38, 0x00, 0x00, 0xfe, 0x00, 0x00, 0x00, 0x00,
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

	    static final  short so_qt_Z_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x80, 0xff, 0x01, 0x80, 0xe1, 0x01,
	       0x80, 0xe0, 0x00, 0x00, 0xf0, 0x00, 0x00, 0x78, 0x00, 0x00, 0x38, 0x00,
	       0x00, 0x3c, 0x00, 0x00, 0x1e, 0x00, 0x00, 0x0e, 0x00, 0x00, 0x0f, 0x01,
	       0x80, 0x07, 0x01, 0x80, 0x83, 0x01, 0x80, 0xff, 0x01, 0x00, 0x00, 0x00,
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00};

	    ///////////////////////////////////////////////////////////////////////////
	    //
	    // viewer cursors
	    //
	    ///////////////////////////////////////////////////////////////////////////

	    static final  short so_qt_viewing_bits[] = {
	       0x03, 0x00, 0x05, 0x00, 0x09, 0x00, 0x11, 0x00, 0x21, 0x00, 0x41, 0x00,
	       0x81, 0x00, 0x01, 0x01, 0x01, 0x02, 0xc1, 0x03, 0x49, 0xee, 0x95, 0xaa,
	       0x93, 0xbb, 0x30, 0xd7, 0x20, 0x55, 0xe0, 0x6d };

	    static final  short so_qt_viewing_mask_bits[] = {
	       0x03, 0x00, 0x07, 0x00, 0x0f, 0x00, 0x1f, 0x00, 0x3f, 0x00, 0x7f, 0x00,
	       0xff, 0x00, 0xff, 0x01, 0xff, 0x03, 0xff, 0x03, 0x7f, 0xee, 0xf7, 0xee,
	       0xf3, 0xff, 0xf0, 0xff, 0xe0, 0x7d, 0xe0, 0x7d };

	    static final  short so_qt_curved_hand_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x06, 0x00, 0x70, 0x69, 0x00, 0x88, 0x91, 0x00,
	       0x08, 0x33, 0x01, 0x30, 0x66, 0x02, 0x20, 0x44, 0x04, 0x40, 0xcc, 0x04,
	       0x80, 0x88, 0x08, 0x84, 0x08, 0x08, 0x9a, 0x00, 0x08, 0xa2, 0x00, 0x10,
	       0xa2, 0x00, 0x10, 0x44, 0x00, 0x10, 0x08, 0x00, 0x10, 0x08, 0x00, 0x20,
	       0x10, 0x00, 0x20, 0xe0, 0x00, 0x20, 0x00, 0x03, 0x20, 0x00, 0x04, 0x20,
	       0x00, 0x08, 0x40, 0x00, 0x10, 0x80, 0x00, 0x20, 0x00, 0x00, 0x40, 0x00};

	    static final  short so_qt_curved_hand_mask_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x06, 0x00, 0x70, 0x6f, 0x00, 0xf8, 0xff, 0x00,
	       0xf8, 0xff, 0x01, 0xf0, 0xff, 0x03, 0xe0, 0xff, 0x07, 0xc0, 0xff, 0x07,
	       0x80, 0xff, 0x0f, 0x84, 0xff, 0x0f, 0x9e, 0xff, 0x0f, 0xbe, 0xff, 0x1f,
	       0xbe, 0xff, 0x1f, 0xfc, 0xff, 0x1f, 0xf8, 0xff, 0x1f, 0xf8, 0xff, 0x3f,
	       0xf0, 0xff, 0x3f, 0xe0, 0xff, 0x3f, 0x00, 0xff, 0x3f, 0x00, 0xfc, 0x3f,
	       0x00, 0xf8, 0x7f, 0x00, 0xf0, 0xff, 0x00, 0xe0, 0x1f, 0x00, 0xc0, 0x03 };

	    static final  short so_qt_flat_hand_bits[] = {
	       0xff, 0xff, 0x03, 0x01, 0x00, 0x02, 0x01, 0x00, 0x02, 0x01, 0x00, 0x03,
	       0x01, 0x80, 0x04, 0x01, 0xe0, 0x1c, 0x01, 0x90, 0x14, 0x01, 0x90, 0x34,
	       0x01, 0x90, 0x24, 0x01, 0x88, 0x64, 0xc1, 0x48, 0xa4, 0x21, 0x45, 0xa4,
	       0x21, 0x45, 0xa2, 0x21, 0x22, 0x92, 0x21, 0x02, 0x92, 0x21, 0x02, 0x91,
	       0x11, 0x01, 0x90, 0x1f, 0x01, 0x48, 0x10, 0x00, 0x40, 0x20, 0x00, 0x40,
	       0x20, 0x00, 0x20, 0x40, 0x00, 0x20, 0x40, 0x00, 0x10, 0x80, 0x00, 0x10,
	       0x00, 0x01, 0x08, 0x00, 0x01, 0x04, 0x00, 0x01, 0x04, 0x00, 0x01, 0x04};

	    static final  short so_qt_flat_hand_mask_bits[] = {
	       0xff, 0xff, 0x03, 0x01, 0x00, 0x02, 0x01, 0x00, 0x02, 0x01, 0x00, 0x03,
	       0x01, 0x80, 0x07, 0x01, 0xe0, 0x1f, 0x01, 0xf0, 0x1f, 0x01, 0xf0, 0x3f,
	       0x01, 0xf0, 0x3f, 0x01, 0xf8, 0x7f, 0xc1, 0xf8, 0xff, 0xe1, 0xfd, 0xff,
	       0xe1, 0xfd, 0xff, 0xe1, 0xff, 0xff, 0xe1, 0xff, 0xff, 0xe1, 0xff, 0xff,
	       0xf1, 0xff, 0xff, 0xff, 0xff, 0x7f, 0xf0, 0xff, 0x7f, 0xe0, 0xff, 0x7f,
	       0xe0, 0xff, 0x3f, 0xc0, 0xff, 0x3f, 0xc0, 0xff, 0x1f, 0x80, 0xff, 0x1f,
	       0x00, 0xff, 0x0f, 0x00, 0xff, 0x07, 0x00, 0xff, 0x07, 0x00, 0xff, 0x07 };

	    static final  short so_qt_pointing_hand_bits[] = {
	       0x00, 0x06, 0x00, 0x00, 0x09, 0x00, 0x80, 0x16, 0x00, 0x40, 0x29, 0x00,
	       0xa0, 0x50, 0x00, 0x50, 0xa6, 0x00, 0x28, 0x49, 0x01, 0x18, 0x89, 0x01,
	       0x00, 0x09, 0x00, 0x00, 0x39, 0x00, 0x00, 0xc9, 0x01, 0x00, 0x41, 0x02,
	       0x00, 0x01, 0x0e, 0x00, 0x01, 0x10, 0x00, 0x01, 0x10, 0x3c, 0x01, 0x10,
	       0xc2, 0x01, 0x10, 0x0c, 0x03, 0x10, 0x10, 0x00, 0x08, 0x20, 0x00, 0x08,
	       0x40, 0x00, 0x08, 0x80, 0x00, 0x04, 0x00, 0x01, 0x04, 0x00, 0x02, 0x04 };

	    static final  short so_qt_pointing_hand_mask_bits[] = {
	       0x00, 0x06, 0x00, 0x00, 0x0f, 0x00, 0x80, 0x1f, 0x00, 0xc0, 0x39, 0x00,
	       0xe0, 0x70, 0x00, 0x70, 0xe6, 0x00, 0x38, 0xcf, 0x01, 0x18, 0x8f, 0x01,
	       0x00, 0x0f, 0x00, 0x00, 0x3f, 0x00, 0x00, 0xff, 0x01, 0x00, 0xff, 0x03,
	       0x00, 0xff, 0x0f, 0x00, 0xff, 0x1f, 0x00, 0xff, 0x1f, 0x3c, 0xff, 0x1f,
	       0xfe, 0xff, 0x1f, 0xfc, 0xff, 0x1f, 0xf0, 0xff, 0x0f, 0xe0, 0xff, 0x0f,
	       0xc0, 0xff, 0x0f, 0x80, 0xff, 0x07, 0x00, 0xff, 0x07, 0x00, 0xfe, 0x07 };

	    static final  short so_qt_roll_bits[] = {
	       0x1c, 0x00, 0x00, 0x34, 0x00, 0x00, 0xe4, 0x1f, 0x00, 0x64, 0x70, 0x00,
	       0x84, 0xcf, 0x00, 0x84, 0xbb, 0x01, 0x04, 0x66, 0x03, 0x04, 0xc4, 0x02,
	       0xff, 0x87, 0x06, 0x05, 0x80, 0x05, 0x05, 0x07, 0x05, 0x05, 0x05, 0x05,
	       0x05, 0x07, 0x05, 0x0d, 0x00, 0x05, 0x0b, 0xff, 0x07, 0x1a, 0x01, 0x01,
	       0x36, 0x03, 0x01, 0xec, 0x0e, 0x01, 0x98, 0x0f, 0x01, 0x70, 0x30, 0x01,
	       0xc0, 0x3f, 0x01, 0x00, 0x60, 0x01, 0x00, 0xc0, 0x01, 0x00, 0x00, 0x00 };

	    static final  short so_qt_roll_mask_bits[] = {
	       0x1c, 0x00, 0x00, 0x3c, 0x00, 0x00, 0xfc, 0x1f, 0x00, 0xfc, 0x7f, 0x00,
	       0xfc, 0xff, 0x00, 0xfc, 0xfb, 0x01, 0xfc, 0xe7, 0x03, 0xfc, 0xc7, 0x03,
	       0xff, 0x87, 0x07, 0x07, 0x80, 0x07, 0x07, 0x07, 0x07, 0x07, 0x07, 0x07,
	       0x07, 0x07, 0x07, 0x0f, 0x00, 0x07, 0x0f, 0xff, 0x07, 0x1e, 0xff, 0x01,
	       0x3e, 0xff, 0x01, 0xfc, 0xfe, 0x01, 0xf8, 0xff, 0x01, 0xf0, 0xff, 0x01,
	       0xc0, 0xff, 0x01, 0x00, 0xe0, 0x01, 0x00, 0xc0, 0x01, 0x00, 0x00, 0x00 };

	    static final  short so_qt_target_bits[] = {
	       0x00, 0x3e, 0x00, 0x00, 0x22, 0x00, 0x00, 0x22, 0x00, 0x80, 0xe3, 0x00,
	       0xc0, 0x80, 0x01, 0x60, 0x63, 0x03, 0xb0, 0xf7, 0x06, 0xd8, 0x94, 0x0d,
	       0x68, 0x14, 0x0b, 0x6f, 0x14, 0x7b, 0xc1, 0xff, 0x41, 0x01, 0x14, 0x40,
	       0xc1, 0xff, 0x41, 0x6f, 0x14, 0x7b, 0x68, 0x14, 0x0b, 0xd8, 0x94, 0x0d,
	       0xb0, 0xf7, 0x06, 0x60, 0x63, 0x03, 0xc0, 0x80, 0x01, 0x80, 0xe3, 0x00,
	       0x00, 0x22, 0x00, 0x00, 0x22, 0x00, 0x00, 0x3e, 0x00, 0x00, 0x00, 0x00 };

	    static final  short so_qt_target_mask_bits[] = {
	       0x00, 0x3e, 0x00, 0x00, 0x3e, 0x00, 0x00, 0x3e, 0x00, 0x80, 0xff, 0x00,
	       0xc0, 0xff, 0x01, 0xe0, 0xff, 0x03, 0xf0, 0xff, 0x07, 0xf8, 0x9c, 0x0f,
	       0x78, 0x1c, 0x0f, 0x7f, 0x1c, 0x7f, 0xff, 0xff, 0x7f, 0xff, 0xf7, 0x7f,
	       0xff, 0xff, 0x7f, 0x7f, 0x1c, 0x7f, 0x78, 0x1c, 0x0f, 0xf8, 0x9c, 0x0f,
	       0xf0, 0xff, 0x07, 0xe0, 0xff, 0x03, 0xc0, 0xff, 0x01, 0x80, 0xff, 0x00,
	       0x00, 0x3e, 0x00, 0x00, 0x3e, 0x00, 0x00, 0x3e, 0x00, 0x00, 0x00, 0x00 };

	    static final  short so_qt_normal_vec_bits[] = {
	       0x00, 0x38, 0x00, 0x00, 0x6c, 0x00, 0x00, 0xc6, 0x00, 0x00, 0x83, 0x01,
	       0x00, 0x29, 0x01, 0x00, 0xef, 0x01, 0x00, 0x28, 0x00, 0x00, 0x28, 0x00,
	       0x00, 0x28, 0x00, 0x00, 0x28, 0x00, 0x00, 0x28, 0x00, 0x00, 0x28, 0x00,
	       0x00, 0x28, 0x00, 0xe0, 0xff, 0x7f, 0x20, 0x10, 0x40, 0x10, 0x38, 0x20,
	       0x10, 0x54, 0x20, 0x08, 0x54, 0x10, 0x08, 0x44, 0x10, 0x04, 0x38, 0x08,
	       0x04, 0x00, 0x08, 0x02, 0x00, 0x04, 0xfe, 0xff, 0x07, 0x00, 0x00, 0x00 };

	    static final  short so_qt_normal_vec_mask_bits[] = {
	       0x00, 0x38, 0x00, 0x00, 0x7c, 0x00, 0x00, 0xfe, 0x00, 0x00, 0xff, 0x01,
	       0x00, 0xff, 0x01, 0x00, 0xff, 0x01, 0x00, 0x38, 0x00, 0x00, 0x38, 0x00,
	       0x00, 0x38, 0x00, 0x00, 0x38, 0x00, 0x00, 0x38, 0x00, 0x00, 0x38, 0x00,
	       0x00, 0x38, 0x00, 0xe0, 0xff, 0x7f, 0xe0, 0xff, 0x7f, 0xf0, 0xff, 0x3f,
	       0xf0, 0xff, 0x3f, 0xf8, 0xff, 0x1f, 0xf8, 0xff, 0x1f, 0xfc, 0xff, 0x0f,
	       0xfc, 0xff, 0x0f, 0xfe, 0xff, 0x07, 0xfe, 0xff, 0x07, 0x00, 0x00, 0x00 };

	    ///////////////////////////////////////////////////////////////////////////
	    //
	    // Walk viewer cursors
	    //
	    ///////////////////////////////////////////////////////////////////////////

	    static final  short so_qt_walk_bits[] = {
	       0x00, 0x80, 0x01, 0x00, 0x00, 0x40, 0x02, 0x00, 0x00, 0xa0, 0x05, 0x00,
	       0x00, 0x50, 0x0a, 0x00, 0x00, 0xa8, 0x15, 0x00, 0x00, 0x54, 0x2a, 0x00,
	       0x00, 0x4c, 0x32, 0x00, 0x00, 0x40, 0x02, 0x00, 0x00, 0x40, 0x02, 0x00,
	       0x00, 0x40, 0x0e, 0x00, 0x00, 0x40, 0x72, 0x00, 0x00, 0x40, 0x90, 0x00,
	       0x00, 0x40, 0x80, 0x03, 0x00, 0x40, 0x00, 0x04, 0x00, 0x40, 0x00, 0x04,
	       0x00, 0x4f, 0x00, 0x04, 0x80, 0x70, 0x00, 0x04, 0x80, 0xc3, 0x00, 0x04,
	       0x00, 0x04, 0x00, 0x06, 0x00, 0x08, 0x00, 0x02, 0x00, 0x10, 0x00, 0x02,
	       0x00, 0x20, 0x00, 0x03, 0x00, 0x40, 0x00, 0x01, 0x00, 0x80, 0x00, 0x01 };

	    static final  short so_qt_walk_mask_bits[] = {
	       0x00, 0x80, 0x01, 0x00, 0x00, 0xc0, 0x03, 0x00, 0x00, 0xe0, 0x07, 0x00,
	       0x00, 0x70, 0x0e, 0x00, 0x00, 0xb8, 0x1d, 0x00, 0x00, 0xdc, 0x3b, 0x00,
	       0x00, 0xcc, 0x33, 0x00, 0x00, 0xc0, 0x03, 0x00, 0x00, 0xc0, 0x03, 0x00,
	       0x00, 0xc0, 0x0f, 0x00, 0x00, 0xc0, 0x7f, 0x00, 0x00, 0xc4, 0xff, 0x00,
	       0x80, 0xc2, 0xff, 0x03, 0x41, 0xc5, 0xff, 0x87, 0xa2, 0xc2, 0xff, 0x47,
	       0x55, 0xcf, 0xff, 0xaf, 0xaa, 0xff, 0xff, 0x57, 0xd5, 0xff, 0xff, 0xaf,
	       0x2a, 0xfc, 0xff, 0x57, 0x55, 0xf8, 0xff, 0xab, 0xaa, 0xf0, 0xff, 0x57,
	       0x55, 0xe1, 0xff, 0xab, 0x00, 0xc0, 0xff, 0x01, 0x00, 0x80, 0xff, 0x01 };

	    static final  short so_qt_pan_bits[] = {
	       0x00, 0x30, 0x00, 0x00, 0x48, 0x00, 0x00, 0xce, 0x01, 0x00, 0x49, 0x01,
	       0x00, 0x49, 0x03, 0x00, 0x49, 0x02, 0x80, 0x48, 0x06, 0x8c, 0x44, 0x0a,
	       0x52, 0x44, 0x0a, 0x52, 0x24, 0x0a, 0x22, 0x22, 0x09, 0x22, 0x20, 0x09,
	       0x22, 0x10, 0x09, 0x11, 0x00, 0x09, 0x11, 0x80, 0x04, 0x01, 0x00, 0x04,
	       0x02, 0x00, 0x04, 0x02, 0x00, 0x02, 0x04, 0x00, 0x02, 0x04, 0x00, 0x01,
	       0x08, 0x00, 0x01, 0x10, 0x80, 0x00, 0x10, 0x40, 0x00, 0x10, 0x40, 0x00};

	    static final  short so_qt_pan_mask_bits[] = {
	       0x00, 0x30, 0x00, 0x00, 0x78, 0x00, 0x00, 0xfe, 0x01, 0x00, 0xff, 0x01,
	       0x00, 0xff, 0x03, 0x00, 0xff, 0x03, 0x80, 0xff, 0x07, 0x8c, 0xff, 0x0f,
	       0xde, 0xff, 0x0f, 0xde, 0xff, 0x0f, 0xfe, 0xff, 0x0f, 0xfe, 0xff, 0x0f,
	       0xfe, 0xff, 0x0f, 0xff, 0xff, 0x0f, 0xff, 0xff, 0x07, 0xff, 0xff, 0x07,
	       0xfe, 0xff, 0x07, 0xfe, 0xff, 0x03, 0xfc, 0xff, 0x03, 0xfc, 0xff, 0x01,
	       0xf8, 0xff, 0x01, 0xf0, 0xff, 0x00, 0xf0, 0x7f, 0x00, 0xf0, 0x7f, 0x00 };

	    static final  short so_qt_tilt_bits[] = {
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
	       0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00, 0x00,
	       0x00, 0xf0, 0x00, 0x00, 0x80, 0x0f, 0x0d, 0x00, 0x40, 0x30, 0x12, 0x00,
	       0x40, 0x60, 0x26, 0x00, 0x80, 0xc3, 0x4c, 0x00, 0x00, 0x84, 0x88, 0x00,
	       0x00, 0x88, 0x99, 0x00, 0x00, 0x10, 0x11, 0x01, 0x80, 0x10, 0x01, 0x01,
	       0x40, 0x13, 0x00, 0x01, 0x40, 0x14, 0x00, 0x02, 0x40, 0x14, 0x00, 0x02,
	       0x80, 0x08, 0x00, 0x02, 0x00, 0x01, 0x00, 0x02, 0x00, 0x01, 0x00, 0x04,
	       0x00, 0x02, 0x00, 0x04, 0x00, 0x1c, 0x00, 0x04, 0x00, 0x60, 0x00, 0x04,
	       0x00, 0x80, 0x00, 0x04, 0x00, 0x00, 0x01, 0x08, 0x00, 0x00, 0x02, 0x10,
	       0x00, 0x00, 0x04, 0x00, 0x00, 0x00, 0x08, 0x00};

	    static final  short so_qt_tilt_mask_bits[] = {
	       0x00, 0x02, 0x00, 0x00, 0x40, 0x05, 0x00, 0x00, 0xa0, 0x0a, 0x00, 0x00,
	       0x54, 0x15, 0x00, 0x00, 0xaa, 0x2a, 0x00, 0x00, 0x55, 0x55, 0x00, 0x00,
	       0xa0, 0x02, 0x00, 0x00, 0x40, 0x01, 0x00, 0x00, 0xa0, 0x00, 0x00, 0x00,
	       0x50, 0xf1, 0x00, 0x00, 0xa0, 0xff, 0x0d, 0x00, 0xd0, 0xff, 0x1f, 0x00,
	       0xc0, 0xff, 0x3f, 0x00, 0x80, 0xff, 0x7f, 0x00, 0x00, 0xfc, 0xff, 0x00,
	       0x00, 0xf8, 0xff, 0x00, 0x00, 0xf0, 0xff, 0x01, 0x80, 0xf0, 0xff, 0x01,
	       0xc0, 0xf3, 0xff, 0x01, 0xc0, 0xf7, 0xff, 0x03, 0xd0, 0xf7, 0xff, 0x03,
	       0xa0, 0xff, 0xff, 0x03, 0x50, 0xff, 0xff, 0x03, 0xa0, 0xff, 0xff, 0x07,
	       0x40, 0xff, 0xff, 0x07, 0xa0, 0xfe, 0xff, 0x07, 0x55, 0xf5, 0xff, 0x07,
	       0xaa, 0xaa, 0xff, 0x07, 0x54, 0x15, 0xff, 0x0f, 0xa0, 0x0a, 0xfe, 0x1f,
	       0x40, 0x05, 0xfc, 0x03, 0x00, 0x02, 0x78, 0x00 };


	    private static final ImageDescriptor[] cachedIcons  = new ImageDescriptor[SoQtIcons.IconNum.ICON_COUNT.ordinal()];

	    private static final Cursor[] cachedCursors = new Cursor[SoQtIcons.CursorNum.CURSOR_COUNT.ordinal()];

	    private static final byte[] shortToByte(short[] shortArray) {
	    	int len = shortArray.length;
	    	byte[] byteArray = new byte[len];
	    	for(int i=0; i<len;i++) {
	    		byteArray[i] = (byte)(Integer.reverse(shortArray[i])>>> 24);
	    	}
	    	return byteArray;
	    }	    
	    
	    public static ImageDescriptor getIcon (IconNum number) {
	    	return getIcon(number.ordinal());
	    }

	    public	static ImageDescriptor getIcon (int number) {
	        if (number < 0 || number >= IconNum.ICON_COUNT.ordinal()) {
	            return null;
	        }
	        if (cachedIcons [number] == null) {
	            final Point size = new Point(so_qt_icon_width, so_qt_icon_height);
	            short[] data = null;
	            String resourceName = "";
	            //QBitmap bits;
	            switch (IconNum.values()[number]) {
	            case ICON_PICK:
	                resourceName = "icons/pickMode.png";
	                data = so_qt_pick_bits; break;
	            case ICON_VIEW:
	                resourceName = "icons/viewMode.png";
	                data = so_qt_view_bits; break;
	            case ICON_HELP:
	                resourceName = "icons/help.png";
	                data = so_qt_help_bits; break;
	            case ICON_HOME:
	                resourceName = "icons/gotoHome.png";
	                data = so_qt_home_bits; break;
	            case ICON_SET_HOME:
	                resourceName = "icons/setHome.png";
	                data = so_qt_set_home_bits; break;
	            case ICON_VIEW_ALL:
	                resourceName = "icons/viewAll.png";
	                data = so_qt_see_all_bits; break;
	            case ICON_SEEK:
	                resourceName = "icons/seek.png";
	                data = so_qt_seek_bits; break;
	            case ICON_ORTHO:
	                resourceName = "icons/ortho.png";
	                data = so_qt_ortho_bits; break;
	            case ICON_PERSP:
	                resourceName = "icons/persp.png";
	                data = so_qt_persp_bits; break;
	            case ICON_X:
	                data = so_qt_X_bits; break;
	            case ICON_Y:
	                data = so_qt_Y_bits; break;
	            case ICON_Z:
	                data = so_qt_Z_bits; break;
				case ICON_COUNT:
					throw new IllegalArgumentException();
				default:
					throw new IllegalArgumentException();
	            }
	            ImageDescriptor imageDescriptor = Activator.getImageDescriptor(resourceName);
	            ImageData icon = null;
	            if(imageDescriptor != null) {
	            	icon = imageDescriptor.getImageData();
	            }
	            //QIcon icon (resourceName);
	            if (icon == null) {
	                icon = fromData (size, data);
//	                QPixmap pix (size);
//	                pix.fill (Qt::black);
//	                pix.setMask (bits);
//	                icon = QIcon (pix);
	            }
	            cachedIcons [number] = ImageDescriptor.createFromImageData(icon);
	        }
	        return cachedIcons [number];	    	
	    }
	    
	    private static final ImageData fromData( Point size, short[] data) {
        	PaletteData paletteData=new PaletteData(new RGB[]{new RGB(255,255,255),new RGB(0,0,0)});
        	ImageData id = new ImageData(size.x,size.y,1,paletteData,1,shortToByte(data));
        	return id;
	    }

	    private static final ImageData fromData( Point size, short[] data, short[] mask) {
	    	ImageData id = fromData(size, data);
	    	id.maskData = shortToByte(mask);
	    	id.maskPad = 1;
        	return id;	    	
	    }

	    public static Cursor getCursor (int number) {
	        if (number < 0 || number >= CursorNum.CURSOR_COUNT.ordinal()) {
	            return new Cursor(Display.getCurrent(),0);
	        }
	        if (cachedCursors [number] == null) {
	            Point size;
	            ImageData bits;
	            ImageData mask;
	            int hotX = -1;
	            int hotY = -1;
	            switch (CursorNum.values()[number]) {
	            case CURSOR_VIEWING:
	                size = new Point (16, 16); hotX = 1; hotY = 1;
	                bits = fromData (size, so_qt_viewing_bits,so_qt_viewing_mask_bits);
	                mask = fromData (size, so_qt_viewing_mask_bits);
	                break;
	            case CURSOR_CURVED_HAND:
	                size = new Point (24, 24); hotX = 4; hotY = 2;
	                bits = fromData (size, so_qt_curved_hand_bits,so_qt_curved_hand_mask_bits);
	                mask = fromData (size, so_qt_curved_hand_mask_bits);
	                break;
	            case CURSOR_FLAT_HAND:
	                size = new Point (24, 28); hotX = 13; hotY = 4;
	                bits = fromData (size, so_qt_flat_hand_bits,so_qt_flat_hand_mask_bits);
	                mask = fromData (size, so_qt_flat_hand_mask_bits);
	                break;
	            case CURSOR_POINTING_HAND:
	                size = new Point (24, 24); hotX = 9; hotY = 4;
	                bits = fromData (size, so_qt_pointing_hand_bits,so_qt_pointing_hand_mask_bits);
	                mask = fromData (size, so_qt_pointing_hand_mask_bits);
	                break;
	            case CURSOR_ROLL:
	                size = new Point (24, 24); hotX = 9; hotY = 11;
	                bits = fromData (size, so_qt_roll_bits,so_qt_roll_mask_bits);
	                mask = fromData (size, so_qt_roll_mask_bits);
	                break;
	            case CURSOR_TARGET:
	                size = new Point (24, 24); hotX = 11; hotY = 11;
	                bits = fromData (size, so_qt_target_bits,so_qt_target_mask_bits);
	                mask = fromData (size, so_qt_target_mask_bits);
	                break;
	            case CURSOR_NORMAL_VEC:
	                size = new Point (24, 24); hotX = 12; hotY = 17;
	                bits = fromData (size, so_qt_normal_vec_bits,so_qt_normal_vec_mask_bits);
	                mask = fromData (size, so_qt_normal_vec_mask_bits);
	                break;
	            case CURSOR_WALK:
	                size = new Point (32, 24); hotX = 15; hotY = 3;
	                bits = fromData (size, so_qt_walk_bits,so_qt_walk_mask_bits);
	                mask = fromData (size, so_qt_walk_mask_bits);
	                break;
	            case CURSOR_PAN:
	                size = new Point (24, 24); hotX = 9; hotY = 1;
	                bits = fromData (size, so_qt_pan_bits,so_qt_pan_mask_bits);
	                mask = fromData (size, so_qt_pan_mask_bits);
	                break;
	            case CURSOR_TILT:
	                size = new Point (32, 32); hotX = 7; hotY = 10;
	                bits = fromData (size, so_qt_tilt_bits,so_qt_tilt_mask_bits);
	                mask = fromData (size, so_qt_tilt_mask_bits);
	                break;
				case CURSOR_COUNT:
					throw new IllegalArgumentException();
				default:
					throw new IllegalArgumentException();
	            }
	    //#if !defined(MACOS) || (QT_VERSION < 0x040400)
	            // Scaling didn't work for Qt4.4 on Mac (and wasn't necessary for cursor creation)
	            if (!size.equals(new Point (32, 32))) {
	                //bits = resizeToNorm(bits);
	                //mask = resizeToNorm(mask);
	            }
	    //#endif
	            cachedCursors [number] = new Cursor (Display.getCurrent(), bits, hotX, hotY);
	        }
	        return (cachedCursors [number]);	    	
	    }

	    static ImageData resizeToNorm(final ImageData bitmap)
	    {
	    	ImageData normBitmap = bitmap.scaledTo(32, 32);
	    	return normBitmap;
	    }

	    
}
