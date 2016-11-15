# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table chief_complaints (
  id                        integer auto_increment not null,
  value                     varchar(255),
  patient_encounter_id      integer,
  sort_Order                integer,
  constraint pk_chief_complaints primary key (id))
;

create table concept_diagnoses (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  constraint pk_concept_diagnoses primary key (id))
;

create table concept_medications (
  id                        integer auto_increment not null,
  name                      varchar(255),
  isDeleted                 tinyint(1) default 0 not null,
  concept_medication_form_id integer,
  constraint pk_concept_medications primary key (id))
;

create table concept_medication_forms (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  description               varchar(255),
  isDeleted                 tinyint(1) default 0,
  constraint uq_concept_medication_forms_name unique (name),
  constraint pk_concept_medication_forms primary key (id))
;

create table concept_medication_generics (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  constraint uq_concept_medication_generics_name unique (name),
  constraint pk_concept_medication_generics primary key (id))
;

create table concept_medication_generic_strengths (
  id                        integer auto_increment not null,
  concept_medication_unit_id integer,
  concept_medication_generic_id integer,
  isDenominator             tinyint(1) default 0 not null,
  value                     double not null,
  constraint uq_concept_medication_generic_strengths_value unique (value),
  constraint pk_concept_medication_generic_strengths primary key (id))
;

create table concept_medication_units (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  description               varchar(255),
  isDeleted                 tinyint(1) default 0,
  constraint uq_concept_medication_units_name unique (name),
  constraint pk_concept_medication_units primary key (id))
;

create table concept_prescription_administrations (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  daily_modifier            float not null,
  constraint uq_concept_prescription_administrations_name unique (name),
  constraint pk_concept_prescription_administrations primary key (id))
;

create table login_attempts (
  id                        integer auto_increment not null,
  user_id                   integer,
  ip_address                varbinary(255) not null,
  date_of_attempt           datetime(6),
  isSuccessful              tinyint(1) default 0 not null,
  username_attempt          varchar(255) not null,
  constraint pk_login_attempts primary key (id))
;

create table medications (
  id                        integer auto_increment not null,
  name                      varchar(255),
  isDeleted                 tinyint(1) default 0 not null,
  concept_medication_forms_id integer,
  constraint pk_medications primary key (id))
;

create table medication_generics (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  constraint uq_medication_generics_name unique (name),
  constraint pk_medication_generics primary key (id))
;

create table medication_generic_strengths (
  id                        integer auto_increment not null,
  concept_medication_units_id integer,
  medication_generics_id    integer,
  isDenominator             tinyint(1) default 0 not null,
  value                     double not null,
  constraint uq_medication_generic_strengths_value unique (value),
  constraint pk_medication_generic_strengths primary key (id))
;

create table medication_inventories (
  id                        integer auto_increment not null,
  quantity_current          integer not null,
  quantity_initial          integer not null,
  medication_id             integer,
  mission_trip_id           integer,
  isDeleted                 datetime(6),
  constraint pk_medication_inventories primary key (id))
;

create table mission_cities (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  mission_country_id        integer not null,
  constraint uq_mission_cities_name unique (name),
  constraint pk_mission_cities primary key (id))
;

create table mission_countries (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  constraint uq_mission_countries_name unique (name),
  constraint pk_mission_countries primary key (id))
;

create table mission_teams (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  location                  varchar(255) not null,
  description               varchar(255) not null,
  constraint uq_mission_teams_name unique (name),
  constraint uq_mission_teams_location unique (location),
  constraint uq_mission_teams_description unique (description),
  constraint pk_mission_teams primary key (id))
;

create table mission_trips (
  id                        integer auto_increment not null,
  mission_team_id           integer,
  mission_city_id           integer,
  start_date                datetime(6),
  end_date                  datetime(6),
  constraint pk_mission_trips primary key (id))
;

create table patients (
  id                        integer auto_increment not null,
  user_id                   integer not null,
  first_name                varchar(255) not null,
  last_name                 varchar(255) not null,
  age                       datetime(6),
  sex                       varchar(255),
  address                   varchar(255),
  city                      varchar(255) not null,
  photo_id                  integer,
  isDeleted                 datetime(6),
  deleted_by_user_id        integer,
  reason_deleted            varchar(255),
  constraint uq_patients_photo_id unique (photo_id),
  constraint pk_patients primary key (id))
;

create table patient_age_classifications (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  description               varchar(255),
  isDeleted                 tinyint(1) default 0,
  sortOrder                 integer,
  constraint uq_patient_age_classifications_name unique (name),
  constraint pk_patient_age_classifications primary key (id))
;

create table patient_encounters (
  id                        integer auto_increment not null,
  patient_id                integer not null,
  user_id_triage            integer not null,
  date_of_triage_visit      datetime(6) not null,
  date_of_medical_visit     datetime(6),
  date_of_pharmacy_visit    datetime(6),
  user_id_medical           integer,
  user_id_pharmacy          integer,
  patient_age_classification_id integer,
  mission_trip_id           integer,
  date_of_diabetes_screen   datetime(6),
  user_id_diabetes_screen   integer,
  is_diabetes_screened      tinyint(1) default 0,
  constraint pk_patient_encounters primary key (id))
;

create table patient_encounter_photos (
  photo_id                  integer auto_increment not null,
  patient_encounter_id      integer not null,
  constraint pk_patient_encounter_photos primary key (photo_id))
;

create table patient_encounter_tab_fields (
  id                        integer auto_increment not null,
  user_id                   integer not null,
  patient_encounter_id      integer not null,
  tab_field_id              integer not null,
  tab_field_value           varchar(255) not null,
  date_taken                datetime(6) not null,
  chief_complaint_id        integer,
  constraint pk_patient_encounter_tab_fields primary key (id))
;

create table patient_encounter_vitals (
  id                        integer auto_increment not null,
  user_id                   integer not null,
  patient_encounter_id      integer not null,
  vital_id                  integer not null,
  vital_value               float not null,
  date_taken                varchar(255) not null,
  constraint uq_patient_encounter_vitals_vital_id unique (vital_id),
  constraint pk_patient_encounter_vitals primary key (id))
;

create table patient_prescriptions (
  id                        integer auto_increment not null,
  encounter_id              integer not null,
  medication_id             integer not null,
  concept_prescription_administrations_id integer,
  user_id                   integer not null,
  amount                    integer,
  date_taken                datetime(6) not null,
  special_instructions      varchar(255),
  isCounseled               tinyint(1) default 0 not null,
  date_dispensed            datetime(6),
  constraint pk_patient_prescriptions primary key (id))
;

create table patient_prescription_replacements (
  id                        integer auto_increment not null,
  patient_prescription_id_original integer not null,
  patient_prescription_id_replacement integer not null,
  patient_prescription_replacement_reason_id integer,
  constraint pk_patient_prescription_replacements primary key (id))
;

create table patient_prescription_replacement_reasons (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  description               varchar(255),
  constraint pk_patient_prescription_replacement_reasons primary key (id))
;

create table photos (
  id                        integer auto_increment not null,
  description               varchar(3072),
  file_path                 varchar(1024),
  insertTS                  datetime(6),
  constraint pk_photos primary key (id))
;

create table patient_encounters (
  id                        integer auto_increment not null,
  patient_id                integer not null,
  user_id_triage            integer not null,
  date_of_triage_visit      datetime(6) not null,
  date_of_medical_visit     datetime(6),
  date_of_pharmacy_visit    datetime(6),
  user_id_medical           integer,
  user_id_pharmacy          integer,
  patient_age_classification_id integer,
  mission_trip_id           integer,
  constraint pk_patient_encounters primary key (id))
;

create table patient_encounter_vitals (
  id                        integer auto_increment not null,
  user_id                   integer not null,
  patient_encounter_id      integer,
  vital_id                  integer not null,
  vital_value               float not null,
  date_taken                varchar(255) not null,
  constraint uq_patient_encounter_vitals_vital_id unique (vital_id),
  constraint pk_patient_encounter_vitals primary key (id))
;

create table roles (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  constraint uq_roles_name unique (name),
  constraint pk_roles primary key (id))
;

create table system_settings (
  id                        integer auto_increment not null,
  name                      varchar(255),
  isActive                  tinyint(1) default 0,
  constraint pk_system_settings primary key (id))
;

create table tabs (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  user_id                   integer,
  date_created              datetime(6) not null,
  isDeleted                 tinyint(1) default 0 not null,
  left_column_size          integer not null,
  right_column_size         integer not null,
  isCustom                  tinyint(1) default 0 not null,
  constraint pk_tabs primary key (id))
;

create table tab_fields (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  isDeleted                 tinyint(1) default 0 not null,
  tab_id                    integer not null,
  type_id                   integer not null,
  size_id                   integer not null,
  sort_order                integer,
  placeholder               varchar(255),
  constraint uq_tab_fields_name unique (name),
  constraint pk_tab_fields primary key (id))
;

create table tab_field_sizes (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  constraint uq_tab_field_sizes_name unique (name),
  constraint pk_tab_field_sizes primary key (id))
;

create table tab_field_types (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  constraint uq_tab_field_types_name unique (name),
  constraint pk_tab_field_types primary key (id))
;

create table users (
  id                        integer auto_increment not null,
  first_name                varchar(255) not null,
  last_name                 varchar(255) not null,
  email                     varchar(255) not null,
  password                  varchar(255) not null,
  last_login                datetime(6) not null,
  isDeleted                 tinyint(1) default 0 not null,
  isPasswordReset           tinyint(1) default 0 not null,
  notes                     varchar(255),
  passwordCreatedDate       datetime(6) not null,
  date_created              datetime(6) not null,
  created_by                integer not null,
  constraint uq_users_email unique (email),
  constraint uq_users_created_by unique (created_by),
  constraint pk_users primary key (id))
;

create table vitals (
  id                        integer auto_increment not null,
  name                      varchar(255) not null,
  data_type                 varchar(255),
  unit_of_measurement       varchar(255),
  isDeleted                 tinyint(1) default 0 not null,
  constraint uq_vitals_name unique (name),
  constraint pk_vitals primary key (id))
;


create table concept_medication_concept_generic_strengths (
  concept_medication_id          integer not null,
  concept_medication_generic_strength_id integer not null,
  constraint pk_concept_medication_concept_generic_strengths primary key (concept_medication_id, concept_medication_generic_strength_id))
;

create table medication_medication_generic_strengths (
  medications_id                 integer not null,
  medication_generic_strength_id integer not null,
  constraint pk_medication_medication_generic_strengths primary key (medications_id, medication_generic_strength_id))
;

create table mission_trip_users (
  mission_trip_id                integer not null,
  user_id                        integer not null,
  constraint pk_mission_trip_users primary key (mission_trip_id, user_id))
;

create table user_roles (
  user_id                        integer not null,
  role_id                        integer not null,
  constraint pk_user_roles primary key (user_id, role_id))
;
alter table chief_complaints add constraint fk_chief_complaints_patientEncounter_1 foreign key (patient_encounter_id) references patient_encounters (id) on delete restrict on update restrict;
create index ix_chief_complaints_patientEncounter_1 on chief_complaints (patient_encounter_id);
alter table concept_medications add constraint fk_concept_medications_conceptMedicationForm_2 foreign key (concept_medication_form_id) references concept_medication_forms (id) on delete restrict on update restrict;
create index ix_concept_medications_conceptMedicationForm_2 on concept_medications (concept_medication_form_id);
alter table concept_medication_generic_strengths add constraint fk_concept_medication_generic_strengths_conceptMedicationUnit_3 foreign key (concept_medication_unit_id) references concept_medication_units (id) on delete restrict on update restrict;
create index ix_concept_medication_generic_strengths_conceptMedicationUnit_3 on concept_medication_generic_strengths (concept_medication_unit_id);
alter table concept_medication_generic_strengths add constraint fk_concept_medication_generic_strengths_conceptMedicationGener_4 foreign key (concept_medication_generic_id) references concept_medication_generics (id) on delete restrict on update restrict;
create index ix_concept_medication_generic_strengths_conceptMedicationGener_4 on concept_medication_generic_strengths (concept_medication_generic_id);
alter table login_attempts add constraint fk_login_attempts_user_5 foreign key (user_id) references users (id) on delete restrict on update restrict;
create index ix_login_attempts_user_5 on login_attempts (user_id);
alter table medications add constraint fk_medications_conceptMedicationForm_6 foreign key (concept_medication_forms_id) references concept_medication_forms (id) on delete restrict on update restrict;
create index ix_medications_conceptMedicationForm_6 on medications (concept_medication_forms_id);
alter table medication_generic_strengths add constraint fk_medication_generic_strengths_conceptMedicationUnit_7 foreign key (concept_medication_units_id) references concept_medication_units (id) on delete restrict on update restrict;
create index ix_medication_generic_strengths_conceptMedicationUnit_7 on medication_generic_strengths (concept_medication_units_id);
alter table medication_generic_strengths add constraint fk_medication_generic_strengths_medicationGeneric_8 foreign key (medication_generics_id) references medication_generics (id) on delete restrict on update restrict;
create index ix_medication_generic_strengths_medicationGeneric_8 on medication_generic_strengths (medication_generics_id);
alter table medication_inventories add constraint fk_medication_inventories_medication_9 foreign key (medication_id) references medications (id) on delete restrict on update restrict;
create index ix_medication_inventories_medication_9 on medication_inventories (medication_id);
alter table medication_inventories add constraint fk_medication_inventories_missionTrip_10 foreign key (mission_trip_id) references mission_trips (id) on delete restrict on update restrict;
create index ix_medication_inventories_missionTrip_10 on medication_inventories (mission_trip_id);
alter table mission_cities add constraint fk_mission_cities_missionCountry_11 foreign key (mission_country_id) references mission_countries (id) on delete restrict on update restrict;
create index ix_mission_cities_missionCountry_11 on mission_cities (mission_country_id);
alter table mission_trips add constraint fk_mission_trips_missionTeam_12 foreign key (mission_team_id) references mission_teams (id) on delete restrict on update restrict;
create index ix_mission_trips_missionTeam_12 on mission_trips (mission_team_id);
alter table mission_trips add constraint fk_mission_trips_missionCity_13 foreign key (mission_city_id) references mission_cities (id) on delete restrict on update restrict;
create index ix_mission_trips_missionCity_13 on mission_trips (mission_city_id);
alter table patients add constraint fk_patients_photo_14 foreign key (photo_id) references photos (id) on delete restrict on update restrict;
create index ix_patients_photo_14 on patients (photo_id);
alter table patient_encounters add constraint fk_patient_encounters_patient_15 foreign key (patient_id) references patients (id) on delete restrict on update restrict;
create index ix_patient_encounters_patient_15 on patient_encounters (patient_id);
alter table patient_encounters add constraint fk_patient_encounters_nurse_16 foreign key (user_id_triage) references users (id) on delete restrict on update restrict;
create index ix_patient_encounters_nurse_16 on patient_encounters (user_id_triage);
alter table patient_encounters add constraint fk_patient_encounters_doctor_17 foreign key (user_id_medical) references users (id) on delete restrict on update restrict;
create index ix_patient_encounters_doctor_17 on patient_encounters (user_id_medical);
alter table patient_encounters add constraint fk_patient_encounters_pharmacist_18 foreign key (user_id_pharmacy) references users (id) on delete restrict on update restrict;
create index ix_patient_encounters_pharmacist_18 on patient_encounters (user_id_pharmacy);
alter table patient_encounters add constraint fk_patient_encounters_patientAgeClassification_19 foreign key (patient_age_classification_id) references patient_age_classifications (id) on delete restrict on update restrict;
create index ix_patient_encounters_patientAgeClassification_19 on patient_encounters (patient_age_classification_id);
alter table patient_encounters add constraint fk_patient_encounters_missionTrip_20 foreign key (mission_trip_id) references mission_trips (id) on delete restrict on update restrict;
create index ix_patient_encounters_missionTrip_20 on patient_encounters (mission_trip_id);
alter table patient_encounters add constraint fk_patient_encounters_diabetesScreener_21 foreign key (user_id_diabetes_screen) references users (id) on delete restrict on update restrict;
create index ix_patient_encounters_diabetesScreener_21 on patient_encounters (user_id_diabetes_screen);
alter table patient_encounter_tab_fields add constraint fk_patient_encounter_tab_fields_user_22 foreign key (user_id) references users (id) on delete restrict on update restrict;
create index ix_patient_encounter_tab_fields_user_22 on patient_encounter_tab_fields (user_id);
alter table patient_encounter_tab_fields add constraint fk_patient_encounter_tab_fields_tabField_23 foreign key (tab_field_id) references tab_fields (id) on delete restrict on update restrict;
create index ix_patient_encounter_tab_fields_tabField_23 on patient_encounter_tab_fields (tab_field_id);
alter table patient_encounter_tab_fields add constraint fk_patient_encounter_tab_fields_chiefComplaint_24 foreign key (chief_complaint_id) references chief_complaints (id) on delete restrict on update restrict;
create index ix_patient_encounter_tab_fields_chiefComplaint_24 on patient_encounter_tab_fields (chief_complaint_id);
alter table patient_encounter_vitals add constraint fk_patient_encounter_vitals_vital_25 foreign key (vital_id) references vitals (id) on delete restrict on update restrict;
create index ix_patient_encounter_vitals_vital_25 on patient_encounter_vitals (vital_id);
alter table patient_prescriptions add constraint fk_patient_prescriptions_patientEncounter_26 foreign key (encounter_id) references patient_encounters (id) on delete restrict on update restrict;
create index ix_patient_prescriptions_patientEncounter_26 on patient_prescriptions (encounter_id);
alter table patient_prescriptions add constraint fk_patient_prescriptions_medication_27 foreign key (medication_id) references medications (id) on delete restrict on update restrict;
create index ix_patient_prescriptions_medication_27 on patient_prescriptions (medication_id);
alter table patient_prescriptions add constraint fk_patient_prescriptions_conceptPrescriptionAdministration_28 foreign key (concept_prescription_administrations_id) references concept_prescription_administrations (id) on delete restrict on update restrict;
create index ix_patient_prescriptions_conceptPrescriptionAdministration_28 on patient_prescriptions (concept_prescription_administrations_id);
alter table patient_prescriptions add constraint fk_patient_prescriptions_physician_29 foreign key (user_id) references users (id) on delete restrict on update restrict;
create index ix_patient_prescriptions_physician_29 on patient_prescriptions (user_id);
alter table patient_prescription_replacements add constraint fk_patient_prescription_replacements_originalPrescription_30 foreign key (patient_prescription_id_original) references patient_prescriptions (id) on delete restrict on update restrict;
create index ix_patient_prescription_replacements_originalPrescription_30 on patient_prescription_replacements (patient_prescription_id_original);
alter table patient_prescription_replacements add constraint fk_patient_prescription_replacements_replacementPrescription_31 foreign key (patient_prescription_id_replacement) references patient_prescriptions (id) on delete restrict on update restrict;
create index ix_patient_prescription_replacements_replacementPrescription_31 on patient_prescription_replacements (patient_prescription_id_replacement);
alter table patient_prescription_replacements add constraint fk_patient_prescription_replacements_patientPrescriptionRepla_32 foreign key (patient_prescription_replacement_reason_id) references patient_prescription_replacement_reasons (id) on delete restrict on update restrict;
create index ix_patient_prescription_replacements_patientPrescriptionRepla_32 on patient_prescription_replacements (patient_prescription_replacement_reason_id);
alter table patient_encounters add constraint fk_patient_encounters_patient_33 foreign key (patient_id) references patients (id) on delete restrict on update restrict;
create index ix_patient_encounters_patient_33 on patient_encounters (patient_id);
alter table patient_encounters add constraint fk_patient_encounters_nurse_34 foreign key (user_id_triage) references users (id) on delete restrict on update restrict;
create index ix_patient_encounters_nurse_34 on patient_encounters (user_id_triage);
alter table patient_encounters add constraint fk_patient_encounters_doctor_35 foreign key (user_id_medical) references users (id) on delete restrict on update restrict;
create index ix_patient_encounters_doctor_35 on patient_encounters (user_id_medical);
alter table patient_encounters add constraint fk_patient_encounters_pharmacist_36 foreign key (user_id_pharmacy) references users (id) on delete restrict on update restrict;
create index ix_patient_encounters_pharmacist_36 on patient_encounters (user_id_pharmacy);
alter table patient_encounters add constraint fk_patient_encounters_patientAgeClassification_37 foreign key (patient_age_classification_id) references patient_age_classifications (id) on delete restrict on update restrict;
create index ix_patient_encounters_patientAgeClassification_37 on patient_encounters (patient_age_classification_id);
alter table patient_encounters add constraint fk_patient_encounters_missionTrip_38 foreign key (mission_trip_id) references mission_trips (id) on delete restrict on update restrict;
create index ix_patient_encounters_missionTrip_38 on patient_encounters (mission_trip_id);
alter table patient_encounter_vitals add constraint fk_patient_encounter_vitals_patientEncounter_39 foreign key (patient_encounter_id) references patient_encounters (id) on delete restrict on update restrict;
create index ix_patient_encounter_vitals_patientEncounter_39 on patient_encounter_vitals (patient_encounter_id);
alter table patient_encounter_vitals add constraint fk_patient_encounter_vitals_vital_40 foreign key (vital_id) references vitals (id) on delete restrict on update restrict;
create index ix_patient_encounter_vitals_vital_40 on patient_encounter_vitals (vital_id);
alter table tab_fields add constraint fk_tab_fields_tab_41 foreign key (tab_id) references tabs (id) on delete restrict on update restrict;
create index ix_tab_fields_tab_41 on tab_fields (tab_id);
alter table tab_fields add constraint fk_tab_fields_tabFieldType_42 foreign key (type_id) references tab_field_types (id) on delete restrict on update restrict;
create index ix_tab_fields_tabFieldType_42 on tab_fields (type_id);
alter table tab_fields add constraint fk_tab_fields_tabFieldSize_43 foreign key (size_id) references tab_field_sizes (id) on delete restrict on update restrict;
create index ix_tab_fields_tabFieldSize_43 on tab_fields (size_id);



alter table concept_medication_concept_generic_strengths add constraint fk_concept_medication_concept_generic_strengths_concept_medic_01 foreign key (concept_medication_id) references concept_medications (id) on delete restrict on update restrict;

alter table concept_medication_concept_generic_strengths add constraint fk_concept_medication_concept_generic_strengths_concept_medic_02 foreign key (concept_medication_generic_strength_id) references concept_medication_generic_strengths (id) on delete restrict on update restrict;

alter table medication_medication_generic_strengths add constraint fk_medication_medication_generic_strengths_medications_01 foreign key (medications_id) references medications (id) on delete restrict on update restrict;

alter table medication_medication_generic_strengths add constraint fk_medication_medication_generic_strengths_medication_generic_02 foreign key (medication_generic_strength_id) references medication_generic_strengths (id) on delete restrict on update restrict;

alter table mission_trip_users add constraint fk_mission_trip_users_mission_trips_01 foreign key (mission_trip_id) references mission_trips (id) on delete restrict on update restrict;

alter table mission_trip_users add constraint fk_mission_trip_users_users_02 foreign key (user_id) references users (id) on delete restrict on update restrict;

alter table user_roles add constraint fk_user_roles_users_01 foreign key (user_id) references users (id) on delete restrict on update restrict;

alter table user_roles add constraint fk_user_roles_roles_02 foreign key (role_id) references roles (id) on delete restrict on update restrict;

# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table chief_complaints;

drop table concept_diagnoses;

drop table concept_medications;

drop table concept_medication_concept_generic_strengths;

drop table concept_medication_forms;

drop table concept_medication_generics;

drop table concept_medication_generic_strengths;

drop table concept_medication_units;

drop table concept_prescription_administrations;

drop table login_attempts;

drop table medications;

drop table medication_medication_generic_strengths;

drop table medication_generics;

drop table medication_generic_strengths;

drop table medication_inventories;

drop table mission_cities;

drop table mission_countries;

drop table mission_teams;

drop table mission_trips;

drop table mission_trip_users;

drop table patients;

drop table patient_age_classifications;

drop table patient_encounters;

drop table patient_encounter_photos;

drop table patient_encounter_tab_fields;

drop table patient_encounter_vitals;

drop table patient_prescriptions;

drop table patient_prescription_replacements;

drop table patient_prescription_replacement_reasons;

drop table photos;

drop table patient_encounters;

drop table patient_encounter_vitals;

drop table roles;

drop table system_settings;

drop table tabs;

drop table tab_fields;

drop table tab_field_sizes;

drop table tab_field_types;

drop table users;

drop table user_roles;

drop table vitals;

SET FOREIGN_KEY_CHECKS=1;

