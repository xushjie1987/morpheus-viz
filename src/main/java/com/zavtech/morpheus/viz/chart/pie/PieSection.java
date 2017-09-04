/**
 * Copyright (C) 2014-2017 Xavier Witdouck
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zavtech.morpheus.viz.chart.pie;

import java.awt.*;

/**
 * An interface to customize sections of a PiePlot.
 *
 * @author Xavier Witdouck
 *
 * <p><strong>This is open source software released under the <a href="http://www.apache.org/licenses/LICENSE-2.0">Apache 2.0 License</a></strong></p>
 */
public interface PieSection {

    /**
     * Sets the color to render this section
     * @param color the color to render this section
     * @return          this section controller
     */
    PieSection withColor(Color color);

    /**
     * Sets an offset degree for this section
     * @param offset    the offset degree
     * @return          this section controller
     */
    PieSection withOffset(double offset);

}