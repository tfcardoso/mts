/* 
 * Copyright 2012 Devoteam http://www.devoteam.com
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 * 
 * 
 * This file is part of Multi-Protocol Test Suite (MTS).
 * 
 * Multi-Protocol Test Suite (MTS) is free software: you can redistribute
 * it and/or modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of the
 * License.
 * 
 * Multi-Protocol Test Suite (MTS) is distributed in the hope that it will
 * be useful, but WITHOUT ANY WARRANTY; without even the implied warranty 
 * of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Multi-Protocol Test Suite (MTS).
 * If not, see <http://www.gnu.org/licenses/>.
 * 
 */

package com.devoteam.srit.xmlloader.core.pluggable;

import com.devoteam.srit.xmlloader.core.Parameter;
import com.devoteam.srit.xmlloader.core.Runner;
import com.devoteam.srit.xmlloader.core.exception.ExecutionException;
import com.devoteam.srit.xmlloader.core.exception.ParameterException;
import java.util.List;
import java.util.Map;

/**
 * Interface that defines a parameters operator.<br/>
 * An operator carries itself the (legacy) names it will be registered with.<br/>
 * @author gpasquiers
 */
public interface PluggableParameterOperator extends PluggableComponent
{
    /**
     * Main method that does the work.
     * @param runner runner that is executing this operation (thus this operator)
     * @param operands map of operands given to this operator
     * @param operatorName the name of the called operator
     * @param resultantName the name of the resultant
     * @return the resultant Parameter.
     * @throws ExecutionException 
     */
    public Parameter operate(Runner runner, Map<String, Parameter> operands, String operatorName, String resultantName) throws Exception;
}
