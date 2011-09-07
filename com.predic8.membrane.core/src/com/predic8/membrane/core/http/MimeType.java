/* Copyright 2009 predic8 GmbH, www.predic8.com

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License. */

package com.predic8.membrane.core.http;

public class MimeType {
	
	public static final String APPLICATION_SOAP = "application/soap+xml";

	public static final String TEXT_XML = "text/xml";
	
	public static final String TEXT_HTML = "text/html;charset=UTF-8";
	
	public static final String TEXT_XML_UTF8 = TEXT_XML + ";charset=UTF-8";

	public static final String JSON = "application/json;charset=utf-8";
	
	public String type;
	
	public String subType;

}
