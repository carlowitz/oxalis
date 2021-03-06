package eu.peppol.security;

/**
 * Known versions of the PKI subsystem.
 *
 * @author steinar
 *         Date: 24.05.13
 *         Time: 16:52
 */
public enum PkiVersion {
    /** Initial version, in which all certificates were "test" certificates, no production certificates */
    V1,
    /** Transitional version only to be used between Sept 1st and Oct 1st 2013 */
    T,
    /** Second version, in which certificates comes in two flavours; TEST or PRODUCTION */
    V2;
}
