package org.hl7.fhir.r4.model.codesystems;

/*
  Copyright (c) 2011+, HL7, Inc.
  All rights reserved.
  
  Redistribution and use in source and binary forms, with or without modification, 
  are permitted provided that the following conditions are met:
  
   * Redistributions of source code must retain the above copyright notice, this 
     list of conditions and the following disclaimer.
   * Redistributions in binary form must reproduce the above copyright notice, 
     this list of conditions and the following disclaimer in the documentation 
     and/or other materials provided with the distribution.
   * Neither the name of HL7 nor the names of its contributors may be used to 
     endorse or promote products derived from this software without specific 
     prior written permission.
  
  THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
  ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
  WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
  IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
  INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
  NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
  PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
  WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
  ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
  POSSIBILITY OF SUCH DAMAGE.
  
*/

// Generated on Mon, Apr 22, 2019 09:16-0500 for FHIR v4.1.0


import org.hl7.fhir.exceptions.FHIRException;

public enum StatisticType {

        /**
         * relative risk (a type of relative effect estimate).
         */
        RELATIVERR, 
        /**
         * odds ratio (a type of relative effect estimate).
         */
        RELATIVEOR, 
        /**
         * hazard ratio (a type of relative effect estimate).
         */
        RELATIVEHR, 
        /**
         * absolute risk difference (a type of absolute effect estimate).
         */
        ABSOLUTEARD, 
        /**
         * mean difference (a type of absolute effect estimate).
         */
        ABSOLUTEMEANDIFF, 
        /**
         * standardized mean difference (a type of absolute effect estimate).
         */
        ABSOLUTESMD, 
        /**
         * median difference (a type of absolute effect estimate).
         */
        ABSOLUTEMEDIANDIFF, 
        /**
         * dichotomous measure (present of absent) reported as a ratio compared to the denominator of 1 (A percentage is a proportion with denominator of 100).
         */
        PROPORTION, 
        /**
         * A special use case where the proportion is derived from a formula rather than derived from summary evidence.
         */
        DERIVEDPROPORTION, 
        /**
         * continuous numerical measure reported as an average.
         */
        MEAN, 
        /**
         * continuous numerical measure reported as the middle of the range.
         */
        MEDIAN, 
        /**
         * descriptive measure reported as total number of items.
         */
        COUNT, 
        /**
         * descriptive measure reported as narrative.
         */
        DESCRIPTIVE, 
        /**
         * added to help the parsers
         */
        NULL;
        public static StatisticType fromCode(String codeString) throws FHIRException {
            if (codeString == null || "".equals(codeString))
                return null;
        if ("relative-RR".equals(codeString))
          return RELATIVERR;
        if ("relative-OR".equals(codeString))
          return RELATIVEOR;
        if ("relative-HR".equals(codeString))
          return RELATIVEHR;
        if ("absolute-ARD".equals(codeString))
          return ABSOLUTEARD;
        if ("absolute-MeanDiff".equals(codeString))
          return ABSOLUTEMEANDIFF;
        if ("absolute-SMD".equals(codeString))
          return ABSOLUTESMD;
        if ("absolute-MedianDiff".equals(codeString))
          return ABSOLUTEMEDIANDIFF;
        if ("proportion".equals(codeString))
          return PROPORTION;
        if ("derivedProportion".equals(codeString))
          return DERIVEDPROPORTION;
        if ("mean".equals(codeString))
          return MEAN;
        if ("median".equals(codeString))
          return MEDIAN;
        if ("count".equals(codeString))
          return COUNT;
        if ("descriptive".equals(codeString))
          return DESCRIPTIVE;
        throw new FHIRException("Unknown StatisticType code '"+codeString+"'");
        }
        public String toCode() {
          switch (this) {
            case RELATIVERR: return "relative-RR";
            case RELATIVEOR: return "relative-OR";
            case RELATIVEHR: return "relative-HR";
            case ABSOLUTEARD: return "absolute-ARD";
            case ABSOLUTEMEANDIFF: return "absolute-MeanDiff";
            case ABSOLUTESMD: return "absolute-SMD";
            case ABSOLUTEMEDIANDIFF: return "absolute-MedianDiff";
            case PROPORTION: return "proportion";
            case DERIVEDPROPORTION: return "derivedProportion";
            case MEAN: return "mean";
            case MEDIAN: return "median";
            case COUNT: return "count";
            case DESCRIPTIVE: return "descriptive";
            default: return "?";
          }
        }
        public String getSystem() {
          return "http://terminology.hl7.org/CodeSystem/statistic-type";
        }
        public String getDefinition() {
          switch (this) {
            case RELATIVERR: return "relative risk (a type of relative effect estimate).";
            case RELATIVEOR: return "odds ratio (a type of relative effect estimate).";
            case RELATIVEHR: return "hazard ratio (a type of relative effect estimate).";
            case ABSOLUTEARD: return "absolute risk difference (a type of absolute effect estimate).";
            case ABSOLUTEMEANDIFF: return "mean difference (a type of absolute effect estimate).";
            case ABSOLUTESMD: return "standardized mean difference (a type of absolute effect estimate).";
            case ABSOLUTEMEDIANDIFF: return "median difference (a type of absolute effect estimate).";
            case PROPORTION: return "dichotomous measure (present of absent) reported as a ratio compared to the denominator of 1 (A percentage is a proportion with denominator of 100).";
            case DERIVEDPROPORTION: return "A special use case where the proportion is derived from a formula rather than derived from summary evidence.";
            case MEAN: return "continuous numerical measure reported as an average.";
            case MEDIAN: return "continuous numerical measure reported as the middle of the range.";
            case COUNT: return "descriptive measure reported as total number of items.";
            case DESCRIPTIVE: return "descriptive measure reported as narrative.";
            default: return "?";
          }
        }
        public String getDisplay() {
          switch (this) {
            case RELATIVERR: return "relative risk";
            case RELATIVEOR: return "odds ratio";
            case RELATIVEHR: return "hazard ratio";
            case ABSOLUTEARD: return "absolute risk difference";
            case ABSOLUTEMEANDIFF: return "mean difference";
            case ABSOLUTESMD: return "standardized mean difference";
            case ABSOLUTEMEDIANDIFF: return "median difference";
            case PROPORTION: return "proportion";
            case DERIVEDPROPORTION: return "derivedProportion";
            case MEAN: return "Mean";
            case MEDIAN: return "Median";
            case COUNT: return "Count";
            case DESCRIPTIVE: return "descriptive";
            default: return "?";
          }
    }


}

