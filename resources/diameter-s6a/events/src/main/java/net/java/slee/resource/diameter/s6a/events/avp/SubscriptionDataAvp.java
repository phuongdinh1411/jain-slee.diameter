/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package net.java.slee.resource.diameter.s6a.events.avp;

import net.java.slee.resource.diameter.base.events.avp.GroupedAvp;

/**
 * Defines an interface representing the Subscription-Data grouped AVP type.
 * From the Diameter S6a Reference Point Protocol Details (3GPP TS 29.272 V12.8.0) specification:
 * 
 * <pre>
 * 7.3.2  Subscription-Data
 * 
 * The Subscription-Data AVP is of type Grouped. It shall contain the information related to the
 * user profile relevant for EPS and GERAN/UTRAN.
 * 
 * AVP format:
 * Subscription-Data ::= < AVP header: 1400 10415 >
 *                       [ Subscriber-Status ]
 *                       [ MSISDN ]
 *                       [ A-MSISDN ]     //R12
 *                       [ STN-SR ]
 *                       [ ICS-Indicator ]
 *                       [ Network-Access-Mode ]
 *                       [ Operator-Determined-Barring ]
 *                       [ HPLMN-ODB ]
 *                    *10[ Regional-Subscription-Zone-Code]
 *                       [ Access-Restriction-Data ]
 *                       [ APN-OI-Replacement ]
 *                       [ LCS-Info ]
 *                       [ Teleservice-List ]
 *                       [ Call-Barring-Info ]
 *                       [ 3GPP-Charging-Characteristics ] 
 *                       [ AMBR ]
 *                       [ APN-Configuration-Profile ]
 *                       [ RAT-Frequency-Selection-Priority-ID ]
 *                       [ Trace-Data]
 *                       [ GPRS-Subscription-Data ]
 *                      *[ CSG-Subscription-Data ] 
 *                       [ Roaming-Restricted-Due-To-Unsupported-Feature ]
 *                       [ Subscribed-Periodic-RAU-TAU-Timer ] //R12
 *                       [ MPS-Priority ]             //R12
 *                       [ VPLMN-LIPA-Allowed ]       //R12
 *                       [ Relay-Node-Indicator ]        //R12
 *                       [ MDT-User-Consent ]           //R12
 *                       [ Subscribed-VSRVCC ]         //R12
 *                       [ ProSe-Subscription-Data ]   //PC4a protocol???
 *                       [ Subscription-Data-Flags ]  //R12
 *                      *[ AVP ]
 * 
 * The AMBR included in this grouped AVP shall include the AMBR associated to the user's
 * subscription (UE-AMBR); Max-Requested-Bandwidth-UL and Max-Requested-Bandwidth-DL within this
 * AVP shall not both be set to "0".
 * 
 * The APN-OI-Replacement included in this grouped AVP shall include the UE level 
 * APN-OI-Replacement associated to the user's subscription.
 * </pre>
 * 
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 * @author <a href="mailto:richard.good@smilecoms.com"> Richard Good </a>
 * @author <a href="mailto:paul.carter-brown@smilecoms.com"> Paul Carter-Brown </a>
 */
public interface SubscriptionDataAvp extends GroupedAvp {

    public boolean hasSubscriberStatus();
    public void setSubscriberStatus(SubscriberStatus ss);
    public SubscriberStatus getSubscriberStatus();

    public boolean hasMSISDN();
    public byte[] getMSISDN();
    public void setMSISDN(byte[] msisdn);

    public boolean hasSTNSR();
    public byte[] getSTNSR();
    public void setSTNSR(byte[] stnsr);

    public boolean hasICSIndicator();
    public ICSIndicator getICSIndicator();
    public void setICSIndicator(ICSIndicator icsIndicator);

    public boolean hasNetworkAccessMode();
    public void setNetworkAccessMode(NetworkAccessMode nam);
    public NetworkAccessMode getNetworkAccessMode();

    public boolean hasOperatorDeterminedBarring();
    public long getOperatorDeterminedBarring();
    public void setOperatorDeterminedBarring(long operatorDeterminedBarring);

    public boolean hasHPLMNODB();
    public long getHPLMNODB();
    public void setHPLMNODB(long hplmnOdb);

    public byte[][] getRegionalSubscriptionZoneCodes();
    public void setRegionalSubscriptionZoneCode(byte[] rszc);
    public void setRegionalSubscriptionZoneCodes(byte[][] rszcs);

    public boolean hasAccessRestrictionData();
    public long getAccessRestrictionData();
    public void setAccessRestrictionData(long ard);

    public boolean hasAPNOIReplacement();
    public String getAPNOIReplacement();
    public void setAPNOIReplacement(String apnOiReplacement);

    public boolean hasLCSInfo();
    public LCSInfoAvp getLCSInfo();
    public void setLCSInfo(LCSInfoAvp lcsInfoAvp);

    public boolean hasTeleserviceList();
    public TeleserviceListAvp getTeleserviceList();
    public void setTeleserviceList(TeleserviceListAvp teleserviceList);

    public boolean hasCallBarringInfo();
    public CallBarringInfoAvp getCallBarringInfo();
    public void setCallBarringInfo(CallBarringInfoAvp callBarringInfo);

    public boolean has3GPPChargingCharacteristics();
    public String get3GPPChargingCharacteristics();
    public void set3GPPChargingCharacteristics(String threeGPPChargingCharacteristics);

    public boolean hasAMBR();
    public AMBRAvp getAMBR();
    public void setAMBR(AMBRAvp ambr);

    public boolean hasAPNConfigurationProfile();
    public APNConfigurationProfileAvp getAPNConfigurationProfile();
    public void setAPNConfigurationProfile(APNConfigurationProfileAvp apnconfigprofile);

    public boolean hasRATFrequencySelectionPriorityID();
    public long getRATFrequencySelectionPriorityID();
    public void setRATFrequencySelectionPriorityID(long rfspid);

    public boolean hasTraceData();
    public TraceDataAvp getTraceData();
    public void setTraceData(TraceDataAvp traceData);

    public boolean hasGPRSSubscriptionData();
    public GPRSSubscriptionDataAvp getGPRSSubscriptionData();
    public void setGPRSSubscriptionData(GPRSSubscriptionDataAvp gprsSubscriptionData);

    public boolean hasCSGSubscriptionData();
    public void setCSGSubscriptionData(CSGSubscriptionDataAvp csgSubscriptionData);
    public CSGSubscriptionDataAvp[] getCSGSubscriptionDatas();
    public void setCSGSubscriptionDatas(CSGSubscriptionDataAvp[] csgSubscriptionDatas);

    public boolean hasRoamingRestrictedDueToUnsupportedFeature();
    public void setRoamingRestrictedDueToUnsupportedFeature(RoamingRestrictedDueToUnsupportedFeature rrdtuf);
    public RoamingRestrictedDueToUnsupportedFeature getRoamingRestrictedDueToUnsupportedFeature();

    public boolean hasMPSPriority();
    public long getMPSPriority();
    public void setMPSPriority(long mpsPriority);

    public boolean hasVPLMNLIPAAllowed();
    public VPLMNLIPAAllowed getVPLMNLIPAAllowed();
    public void setVPLMNLIPAAllowed(VPLMNLIPAAllowed vplmnlipaAllowed);

    public boolean hasSubscribedPeriodicRAUTAUTimer();
    public long getSubscribedPeriodicRAUTAUTimer();
    public void setSubscribedPeriodicRAUTAUTimer(long subscribedPeriodicRAUTAUTimer);

    public boolean hasRelayNodeIndicator();
    public RelayNodeIndicator getRelayNodeIndicator();
    public void setRelayNodeIndicator(RelayNodeIndicator relayNodeIndicator);

    public boolean hasMDTUserConsent();
    public MDTUserConsent getMDTUserConsent();
    public void setMDTUserConsent(MDTUserConsent mdtUserConsent);

    public boolean hasSubscribedVSRVCC();
    public SubscribedVSRVCC getSubscribedVSRVCC();
    public void setSubscribedVSRVCC(SubscribedVSRVCC subscribedVSRVCC);

    public boolean hasAMSISDN();
    public byte[] getAMSISDN();
    public void setAMSISDN(byte[] amsisdn);

    public boolean hasSubscriptionDataFlags();
    public long getSubscriptionDataFlags();
    public void setSubscriptionDataFlags(long subscriptionDataFlags);

    public boolean hasProSeSubscriptionData();
    public ProSESubscriptionDataAvp getProSeSubscriptionData();
    public void setProSeSubscriptionData(ProSESubscriptionDataAvp proSeSubscriptionDataAvp);
}