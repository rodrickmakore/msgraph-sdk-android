// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Entity Request Builder.
 */
public interface IBaseEntityRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     */
    IEntityRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     */
    IEntityRequest buildRequest(final java.util.List<Option> requestOptions);

    IDirectoryObjectRequestBuilder directoryObject();

    IExtensionRequestBuilder extension();

    IDomainRequestBuilder domain();

    IDomainDnsRecordRequestBuilder domainDnsRecord();

    ILicenseDetailsRequestBuilder licenseDetails();

    IConversationThreadRequestBuilder conversationThread();

    ICalendarRequestBuilder calendar();

    IOutlookItemRequestBuilder outlookItem();

    IConversationRequestBuilder conversation();

    IProfilePhotoRequestBuilder profilePhoto();

    IBaseItemRequestBuilder baseItem();

    IPlannerGroupRequestBuilder plannerGroup();

    IOnenoteRequestBuilder onenote();

    ISubscribedSkuRequestBuilder subscribedSku();

    IMailFolderRequestBuilder mailFolder();

    ICalendarGroupRequestBuilder calendarGroup();

    IContactFolderRequestBuilder contactFolder();

    IInferenceClassificationRequestBuilder inferenceClassification();

    IPlannerUserRequestBuilder plannerUser();


    IAttachmentRequestBuilder attachment();

    ISingleValueLegacyExtendedPropertyRequestBuilder singleValueLegacyExtendedProperty();

    IMultiValueLegacyExtendedPropertyRequestBuilder multiValueLegacyExtendedProperty();

    IInferenceClassificationOverrideRequestBuilder inferenceClassificationOverride();

    IPermissionRequestBuilder permission();

    IThumbnailSetRequestBuilder thumbnailSet();

    IWorkbookRequestBuilder workbook();

    ISharePointRequestBuilder sharePoint();

    IListRequestBuilder list();

    IWorkbookApplicationRequestBuilder workbookApplication();

    IWorkbookNamedItemRequestBuilder workbookNamedItem();

    IWorkbookTableRequestBuilder workbookTable();

    IWorkbookWorksheetRequestBuilder workbookWorksheet();

    IWorkbookFunctionsRequestBuilder workbookFunctions();

    IWorkbookChartRequestBuilder workbookChart();

    IWorkbookChartAxesRequestBuilder workbookChartAxes();

    IWorkbookChartDataLabelsRequestBuilder workbookChartDataLabels();

    IWorkbookChartAreaFormatRequestBuilder workbookChartAreaFormat();

    IWorkbookChartLegendRequestBuilder workbookChartLegend();

    IWorkbookChartSeriesRequestBuilder workbookChartSeries();

    IWorkbookChartTitleRequestBuilder workbookChartTitle();

    IWorkbookChartFillRequestBuilder workbookChartFill();

    IWorkbookChartFontRequestBuilder workbookChartFont();

    IWorkbookChartAxisRequestBuilder workbookChartAxis();

    IWorkbookChartAxisFormatRequestBuilder workbookChartAxisFormat();

    IWorkbookChartGridlinesRequestBuilder workbookChartGridlines();

    IWorkbookChartAxisTitleRequestBuilder workbookChartAxisTitle();

    IWorkbookChartLineFormatRequestBuilder workbookChartLineFormat();

    IWorkbookChartAxisTitleFormatRequestBuilder workbookChartAxisTitleFormat();

    IWorkbookChartDataLabelFormatRequestBuilder workbookChartDataLabelFormat();

    IWorkbookChartGridlinesFormatRequestBuilder workbookChartGridlinesFormat();

    IWorkbookChartLegendFormatRequestBuilder workbookChartLegendFormat();

    IWorkbookChartPointRequestBuilder workbookChartPoint();

    IWorkbookChartPointFormatRequestBuilder workbookChartPointFormat();

    IWorkbookChartSeriesFormatRequestBuilder workbookChartSeriesFormat();

    IWorkbookChartTitleFormatRequestBuilder workbookChartTitleFormat();

    IWorkbookFilterRequestBuilder workbookFilter();

    IWorkbookFormatProtectionRequestBuilder workbookFormatProtection();

    IWorkbookFunctionResultRequestBuilder workbookFunctionResult();

    IWorkbookPivotTableRequestBuilder workbookPivotTable();

    IWorkbookRangeRequestBuilder workbookRange();

    IWorkbookRangeFormatRequestBuilder workbookRangeFormat();

    IWorkbookRangeSortRequestBuilder workbookRangeSort();

    IWorkbookRangeBorderRequestBuilder workbookRangeBorder();

    IWorkbookRangeFillRequestBuilder workbookRangeFill();

    IWorkbookRangeFontRequestBuilder workbookRangeFont();

    IWorkbookRangeViewRequestBuilder workbookRangeView();

    IWorkbookTableColumnRequestBuilder workbookTableColumn();

    IWorkbookTableRowRequestBuilder workbookTableRow();

    IWorkbookTableSortRequestBuilder workbookTableSort();

    IWorkbookWorksheetProtectionRequestBuilder workbookWorksheetProtection();

    ISubscriptionRequestBuilder subscription();

    IInvitationRequestBuilder invitation();

    IPlannerTaskRequestBuilder plannerTask();

    IPlannerPlanRequestBuilder plannerPlan();

    IPlannerRequestBuilder planner();

    IPlannerBucketRequestBuilder plannerBucket();

    IPlannerTaskDetailsRequestBuilder plannerTaskDetails();

    IPlannerAssignedToTaskBoardTaskFormatRequestBuilder plannerAssignedToTaskBoardTaskFormat();

    IPlannerProgressTaskBoardTaskFormatRequestBuilder plannerProgressTaskBoardTaskFormat();

    IPlannerBucketTaskBoardTaskFormatRequestBuilder plannerBucketTaskBoardTaskFormat();

    IPlannerPlanDetailsRequestBuilder plannerPlanDetails();

    IOnenoteEntityBaseModelRequestBuilder onenoteEntityBaseModel();

}
