/*
// $Id$
// Package org.eigenbase is a class library of data management components.
// Copyright (C) 2004-2005 The Eigenbase Project
// Copyright (C) 2004-2005 Disruptive Tech
// Copyright (C) 2005-2005 LucidEra, Inc.
//
// This program is free software; you can redistribute it and/or modify it
// under the terms of the GNU General Public License as published by the Free
// Software Foundation; either version 2 of the License, or (at your option)
// any later version approved by The Eigenbase Project.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU General Public License
// along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
*/

package org.eigenbase.sql.validate;

import org.eigenbase.sql.SqlIdentifier;

/**
 * An interface of an object identifier that represents a SqlIdentifier
 *
 * @author tleung
 * @since May 24, 2005
 * @version $Id$
 **/
public interface SqlMoniker
{
    /**
     * Returns the type of object referred to by this moniker. Never null.
     */
    SqlMonikerType getType();

    /**
     * Returns the array of component names.
     */
    String[] getFullyQualifiedNames();

    /**
     * Creates a {@link SqlIdentifier} containing the fully-qualified name.
     */
    SqlIdentifier toIdentifier();
}

// End SqlMoniker.java