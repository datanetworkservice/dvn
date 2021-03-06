/*
   Copyright (C) 2005-2012, by the President and Fellows of Harvard College.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

         http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

   Dataverse Network - A web application to share, preserve and analyze research data.
   Developed at the Institute for Quantitative Social Science, Harvard University.
   Version 3.0.
*/
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.harvard.iq.dvn.ingest.dsb;

import java.io.InputStream;
import java.util.*;
    
/**
 *
 * @author asone
 */
public interface FieldCutter {
    public  void subsetFile(String infile, String outfile, Set<Integer> columns, Long numCases);

    public void subsetFile(String infile, String outfile, Set<Integer> columns, Long numCases,
        String delimiter);

    public void subsetFile(InputStream in, String outfile, Set<Integer> columns, Long numCases,
        String delimiter);
}
