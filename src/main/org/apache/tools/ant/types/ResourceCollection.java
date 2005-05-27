/*
 * Copyright 2005 The Apache Software Foundation
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.tools.ant.types;

import java.util.Iterator;

/**
 * Interface describing a collection of Resources.
 * @since Ant 1.7
 */
public interface ResourceCollection {

    /**
     * Get an Iterator over the contents of this ResourceCollection, whose elements
     * are <code>org.apache.tools.ant.types.Resource</code> instances.
     * @return an Iterator of Resources.
     */
    public Iterator iterator();

    /**
     * Learn the number of contained Resources.
     * @return number of elements as int.
     */
    public int size();

    /**
     * Indicate whether this ResourceCollection is composed entirely of
     * Resources accessible via local filesystem conventions.  If true,
     * all Resources returned from this ResourceCollection should be
     * instances of FileResource.
     * @return whether this is a filesystem-only resource collection.
     */
    public boolean isFilesystemOnly();

}