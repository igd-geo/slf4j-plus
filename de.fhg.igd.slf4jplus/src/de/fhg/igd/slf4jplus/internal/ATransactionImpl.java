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

package de.fhg.igd.slf4jplus.internal;

import de.fhg.igd.slf4jplus.ATransaction;

/**
 * Represents a log transaction
 * 
 * @author Simon Templer
 */
public class ATransactionImpl implements ATransaction {
	
	private final String identifier;
	
	private final ALoggerImpl logger;

	/**
	 * Create a log transaction with the given identifier
	 * 
	 * @param logger the logger 
	 * @param identifier the transaction identifier
	 */
	ATransactionImpl(ALoggerImpl logger, String identifier) {
		super();
		this.identifier = identifier;
		this.logger = logger;
	}

	/**
	 * @see ATransaction#getIdentifier()
	 */
	@Override
	public String getIdentifier() {
		return identifier;
	}

	/**
	 * @see ATransaction#end()
	 */
	@Override
	public void end() {
		logger.end(this);
	}

	/**
	 * @see Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((identifier == null) ? 0 : identifier.hashCode());
		return result;
	}

	/**
	 * @see Object#equals(Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ATransactionImpl other = (ATransactionImpl) obj;
		if (identifier == null) {
			if (other.identifier != null)
				return false;
		} else if (!identifier.equals(other.identifier))
			return false;
		return true;
	}

}
