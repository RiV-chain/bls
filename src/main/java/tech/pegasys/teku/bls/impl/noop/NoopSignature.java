/*
 * Copyright 2020 ConsenSys AG.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package tech.pegasys.teku.bls.impl.noop;

import java.util.List;
import org.apache.tuweni.bytes.Bytes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.pegasys.teku.bls.impl.PublicKey;
import tech.pegasys.teku.bls.impl.PublicKeyMessagePair;
import tech.pegasys.teku.bls.impl.mikuli.MikuliSignature;

public class NoopSignature extends MikuliSignature {
	private static final Logger log = LoggerFactory.getLogger(NoopSignature.class);

	public NoopSignature(MikuliSignature signature) {
		super(signature);
	}

	@Override
	public boolean verify(List<PublicKeyMessagePair> keysToMessages) {
		log.warn("BLS verification is disabled");
		return true;
	}

	@Override
	public boolean verify(List<PublicKey> publicKeys, Bytes message) {
		log.warn("BLS verification is disabled");
		return true;
	}

	@Override
	public boolean verify(PublicKey publicKey, Bytes message, String dst) {
		log.warn("BLS verification is disabled");
		return true;
	}

	@Override
	public boolean verify(PublicKey publicKey, Bytes message) {
		log.warn("BLS verification is disabled");
		return true;
	}
}
