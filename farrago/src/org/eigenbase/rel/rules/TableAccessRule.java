/*
// $Id$
// Package org.eigenbase is a class library of data management components.
// Copyright (C) 2006-2006 The Eigenbase Project
// Copyright (C) 2006-2006 Disruptive Tech
// Copyright (C) 2006-2006 LucidEra, Inc.
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
package org.eigenbase.rel.rules;

import org.eigenbase.relopt.*;
import org.eigenbase.rel.*;

/**
 * TableAccessRule converts a TableAccessRel to the result
 * of calling {@link RelOptTable#toRel}.
 *
 * @author John V. Sichi
 * @version $Id$
 */
public class TableAccessRule extends RelOptRule
{
    public static final TableAccessRule instance = new TableAccessRule();
    
    private TableAccessRule()
    {
        super(
            new RelOptRuleOperand(
                TableAccessRel.class,
                null));
    }

    public void onMatch(RelOptRuleCall call)
    {
        TableAccessRel oldRel = (TableAccessRel) call.rels[0];
        RelNode newRel = oldRel.getTable().toRel(
            oldRel.getCluster(),
            oldRel.getConnection());
        call.transformTo(newRel);
    }
}

// End TableAccessRule.java