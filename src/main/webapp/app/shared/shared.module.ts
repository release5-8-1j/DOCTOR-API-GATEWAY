import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { NgbDateAdapter } from '@ng-bootstrap/ng-bootstrap';

import { NgbDateMomentAdapter } from './util/datepicker-adapter';
import { DoctorgatewaySharedLibsModule, DoctorgatewaySharedCommonModule, HasAnyAuthorityDirective } from './';

@NgModule({
    imports: [DoctorgatewaySharedLibsModule, DoctorgatewaySharedCommonModule],
    declarations: [HasAnyAuthorityDirective],
    providers: [{ provide: NgbDateAdapter, useClass: NgbDateMomentAdapter }],
    exports: [DoctorgatewaySharedCommonModule, HasAnyAuthorityDirective],
    schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class DoctorgatewaySharedModule {
    static forRoot() {
        return {
            ngModule: DoctorgatewaySharedModule
        };
    }
}
