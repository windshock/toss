// entry=0x84150

void H84150(undefined8 param_1,undefined8 param_2)

{
  char cVar1;
  bool bVar2;
  undefined8 in_x6;
  undefined8 in_x7;
  long *in_x16;
  undefined8 unaff_x27;
  undefined8 unaff_x28;
  long unaff_x29;
  undefined8 unaff_x30;
  
  **(undefined8 **)(unaff_x29 + -400) = *(undefined8 *)(*in_x16 + 8);
  *(undefined8 *)(unaff_x29 + -0xc0) = in_x7;
  *(undefined8 *)(unaff_x29 + -200) = unaff_x27;
  *(undefined8 *)(unaff_x29 + -0xd0) = param_2;
  *(undefined8 *)(unaff_x29 + -0xd8) = in_x6;
  *(undefined8 *)(unaff_x29 + -0xe0) = unaff_x28;
  *(undefined8 *)(unaff_x29 + -0xe8) = unaff_x30;
  do {
    if (DAT_0029e780 != 0) {
      ClearExclusiveLocal();
      break;
    }
    cVar1 = '\x01';
    bVar2 = (bool)ExclusiveMonitorPass(0x29e780,0x10);
    if (bVar2) {
      DAT_0029e780 = 1;
      cVar1 = ExclusiveMonitorsStatus();
    }
  } while (cVar1 != '\0');
                    /* WARNING: Could not recover jumptable at 0x0018979c. Too many branches */
                    /* WARNING: Treating indirect jump as call */
  (*(code *)PTR_H8215c_0027d1a8)();
  return;
}


