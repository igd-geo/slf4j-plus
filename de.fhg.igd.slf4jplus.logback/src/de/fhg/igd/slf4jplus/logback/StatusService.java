// Fraunhofer Institute for Computer Graphics Research (IGD)
// Department Graphical Information Systems (GIS)
//
// Copyright (c) 2010 Fraunhofer IGD
//
// This file is part of slf4j-plus.
//
// slf4j-plus is free software: you can redistribute
// it and/or modify it under the terms of the GNU Lesser General Public License
// as published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// slf4j-plus is distributed in the hope that it will
// be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with slf4j-plus.
// If not, see <http://www.gnu.org/licenses/>.

package de.fhg.igd.slf4jplus.logback;

import ch.qos.logback.classic.spi.LoggingEvent;

/**
 * Log service based on Logback's {@link LoggingEvent}s
 * 
 * @author Simon Templer
 */
public interface StatusService {
	
	/**
	 * Add a log observer
	 * 
	 * @param observer the observer to add
	 */
	public void addObserver(LogObserver observer);
	
	/**
	 * Remove a log observer
	 * 
	 * @param observer the observer to remove
	 */
	public void removeObserver(LogObserver observer);

}
