package org.hl7.fhir.instance.model;

// Generated on Thu, Nov 6, 2014 07:40+1100 for FHIR v0.3.0

public enum ResourceType {
    Condition,
    Supply,
    Organization,
    Group,
    OralHealthClaim,
    ValueSet,
    Coverage,
    ImmunizationRecommendation,
    Appointment,
    MedicationDispense,
    MedicationPrescription,
    Slot,
    Contraindication,
    AppointmentResponse,
    MedicationStatement,
    Composition,
    Questionnaire,
    OperationOutcome,
    Conformance,
    NamingSystem,
    Media,
    Binary,
    Other,
    HealthcareService,
    Profile,
    DocumentReference,
    Immunization,
    ExtensionDefinition,
    Subscription,
    OrderResponse,
    ConceptMap,
    ImagingStudy,
    Practitioner,
    CarePlan,
    Provenance,
    NewBundle,
    Device,
    Query,
    Order,
    Procedure,
    Substance,
    DiagnosticReport,
    Medication,
    MessageHeader,
    DocumentManifest,
    DataElement,
    Availability,
    MedicationAdministration,
    QuestionnaireAnswers,
    Encounter,
    SecurityEvent,
    List,
    OperationDefinition,
    DeviceObservationReport,
    NutritionOrder,
    ClaimResponse,
    ReferralRequest,
    RiskAssessment,
    FamilyHistory,
    Location,
    AllergyIntolerance,
    Observation,
    Contract,
    RelatedPerson,
    Basic,
    Specimen,
    Alert,
    Patient,
    DiagnosticOrder;


    public String getPath() {;
      switch (this) {
    case Condition:
      return "condition";
    case Supply:
      return "supply";
    case Organization:
      return "organization";
    case Group:
      return "group";
    case OralHealthClaim:
      return "oralhealthclaim";
    case ValueSet:
      return "valueset";
    case Coverage:
      return "coverage";
    case ImmunizationRecommendation:
      return "immunizationrecommendation";
    case Appointment:
      return "appointment";
    case MedicationDispense:
      return "medicationdispense";
    case MedicationPrescription:
      return "medicationprescription";
    case Slot:
      return "slot";
    case Contraindication:
      return "contraindication";
    case AppointmentResponse:
      return "appointmentresponse";
    case MedicationStatement:
      return "medicationstatement";
    case Composition:
      return "composition";
    case Questionnaire:
      return "questionnaire";
    case OperationOutcome:
      return "operationoutcome";
    case Conformance:
      return "conformance";
    case NamingSystem:
      return "namingsystem";
    case Media:
      return "media";
    case Binary:
      return "binary";
    case Other:
      return "other";
    case HealthcareService:
      return "healthcareservice";
    case Profile:
      return "profile";
    case DocumentReference:
      return "documentreference";
    case Immunization:
      return "immunization";
    case ExtensionDefinition:
      return "extensiondefinition";
    case Subscription:
      return "subscription";
    case OrderResponse:
      return "orderresponse";
    case ConceptMap:
      return "conceptmap";
    case ImagingStudy:
      return "imagingstudy";
    case Practitioner:
      return "practitioner";
    case CarePlan:
      return "careplan";
    case Provenance:
      return "provenance";
    case NewBundle:
      return "newbundle";
    case Device:
      return "device";
    case Query:
      return "query";
    case Order:
      return "order";
    case Procedure:
      return "procedure";
    case Substance:
      return "substance";
    case DiagnosticReport:
      return "diagnosticreport";
    case Medication:
      return "medication";
    case MessageHeader:
      return "messageheader";
    case DocumentManifest:
      return "documentmanifest";
    case DataElement:
      return "dataelement";
    case Availability:
      return "availability";
    case MedicationAdministration:
      return "medicationadministration";
    case QuestionnaireAnswers:
      return "questionnaireanswers";
    case Encounter:
      return "encounter";
    case SecurityEvent:
      return "securityevent";
    case List:
      return "list";
    case OperationDefinition:
      return "operationdefinition";
    case DeviceObservationReport:
      return "deviceobservationreport";
    case NutritionOrder:
      return "nutritionorder";
    case ClaimResponse:
      return "claimresponse";
    case ReferralRequest:
      return "referralrequest";
    case RiskAssessment:
      return "riskassessment";
    case FamilyHistory:
      return "familyhistory";
    case Location:
      return "location";
    case AllergyIntolerance:
      return "allergyintolerance";
    case Observation:
      return "observation";
    case Contract:
      return "contract";
    case RelatedPerson:
      return "relatedperson";
    case Basic:
      return "basic";
    case Specimen:
      return "specimen";
    case Alert:
      return "alert";
    case Patient:
      return "patient";
    case DiagnosticOrder:
      return "diagnosticorder";
    }
      return null;
  }

}
